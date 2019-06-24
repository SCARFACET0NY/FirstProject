package library_management;

import java.util.HashMap;
import java.util.Stack;

public class Catalog implements Search {
    private HashMap<String, Integer> booksCount;
    private HashMap<String, Stack<BookItem>> booksByTitle;
    private HashMap<String, String> booksByISBN;

    public Catalog() {
        booksCount = new HashMap<>();
        booksByTitle = new HashMap<>();
        booksByISBN = new HashMap<>();
    }

    public BookItem checkoutBook(String title) {
        return booksByTitle.get(title).pop();
    }

    public void returnBook(BookItem book) {
        booksByTitle.get(book.getTitle()).push(book);
    }

    public void addBook(BookItem book) {
        Stack<BookItem> books = new Stack<>();
        books.push(book);

        booksByTitle.put(book.getTitle(), books);
        booksByISBN.put(book.getISBN(), book.getTitle());
        booksCount.put(book.getTitle(), 1);
    }

    public void removeBook(BookItem book) {
        booksByTitle.remove(book.getTitle());
        booksByISBN.remove(book.getISBN());
        booksCount.remove(book.getTitle());
    }

    public void addBookItems(String title, int count) {
        for (int i = 0; i < count; i++) {
            BookItem book = booksByTitle.get(title).peek();
            book.setBarCode(booksCount.get(title) + i);

            booksByTitle.get(title).push(book);
        }
        booksCount.put(title, booksCount.get(title) + count);
    }

    public void removeBookItems(String title, int count) {
        for (int i = 0; i < count; i++) {
            booksByTitle.get(title).pop();
        }
        booksCount.put(title, booksCount.get(title) - count);
    }

    public int getBookCount(String title) {
        return booksCount.get(title);
    }

    public int getAvailableBooksCount(String title) {
        return booksByTitle.get(title).size();
    }

    public boolean searchBookByTitle(String title) {
        return booksByTitle.containsKey(title);
    }

    public boolean searchBookByISBN(String ISBN) {
        return searchBookByTitle(ISBN);
    }
}
