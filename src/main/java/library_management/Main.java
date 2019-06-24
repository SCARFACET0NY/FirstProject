package library_management;

import library_management.book.Author;
import library_management.book.BookItem;
import library_management.factory.BookItemFactory;
import library_management.library.Library;
import library_management.reader.LibraryCard;
import library_management.reader.Reader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void init(Library.Librarian librarian) {
        librarian.addBook(BookItemFactory.getBookItem("book 1"));
        librarian.addBook(BookItemFactory.getBookItem("book 2"));
        librarian.addBook(BookItemFactory.getBookItem("book 3"));
        librarian.addBook(BookItemFactory.getBookItem("book 4"));

        librarian.addBookItems("book 1", 10);
        librarian.addBookItems("book 2", 2);
        librarian.addBookItems("book 3", 5);
        librarian.addBookItems("book 4", 7);

        Reader reader1 = new Reader("First 1", "Second 1", "Last 1",
                new LibraryCard(1, LocalDate.of(2019, 5, 15)));
        Reader reader2 = new Reader("First 2", "Second 2", "Last 2",
                new LibraryCard(2, LocalDate.of(2019, 2, 5)));
        Reader reader3 = new Reader("First 3", "Second 3", "Last 3",
                new LibraryCard(3, LocalDate.of(2019, 6, 17)));
        Reader reader4 = new Reader("First 4", "Second 4", "Last 4",
                new LibraryCard(4, LocalDate.of(2019, 3, 28)));

        librarian.addReader(reader1);
        librarian.addReader(reader2);
        librarian.addReader(reader3);
        librarian.addReader(reader4);

        librarian.checkoutBooks(reader1,
                LocalDate.of(2019, 6, 15), LocalDate.of(2019, 6, 28),
                "book 1", "book 2");
        librarian.checkoutBooks(reader2,
                LocalDate.of(2019, 6, 17), LocalDate.of(2019, 6, 26),
                "book 2");
        librarian.checkoutBooks(reader3,
                LocalDate.of(2019, 6, 10), LocalDate.of(2019, 6, 22),
                "book 4");
        librarian.returnBooks(reader3, LocalDate.of(2019, 6, 21), "book 4");
    }

    public static void main(String[] args) {
        Library library = new Library();
        Library.Librarian librarian = library.new Librarian("Librarian First Name", "Librarian Second Name");;

        init(librarian);

        librarian.addBook(new BookItem(1, "book 5", "555-666-777", 2019,
                "Place 5", "Publishing house 5",
                new ArrayList<>(Arrays.asList(new Author("First Name 5", "Last Name 5",
                        "Biography 5"))), "text 5"));

        librarian.addBookItems("book 5", 5);

        Reader reader = new Reader("First 5", "Second 5", "Last 5",
                new LibraryCard(5, LocalDate.of(2019, 4, 6)));

        librarian.addReader(reader);

        System.out.println(librarian.searchBookByTitle("book 3"));
        System.out.println(librarian.searchBookByTitle("book 15"));
        System.out.println(librarian.searchBookByISBN("555-666-777"));

        librarian.checkoutBooks(reader,
                LocalDate.of(2019, 6, 12), LocalDate.of(2019, 6, 28),
                "book 2", "book 3", "book 5");


        librarian.booksLentByReaderNow(reader);

        System.out.println(librarian.isBookAvailable("book 2"));
        System.out.println(librarian.isBookAvailable("book 1"));
        System.out.println(librarian.getAvailableBooksCount("book 2"));
        System.out.println(librarian.getAvailableBooksCount("book 5"));
        System.out.println(librarian.getBookCount("book 2"));

        librarian.returnBooks(reader,
                LocalDate.of(2019, 6, 23),
                "book 2", "book 3", "book 5");
        librarian.booksLentByReaderNow(reader);

        librarian.booksCheckedOutInPeriod(LocalDate.of(2019, 6, 12),
                LocalDate.of(2019, 6, 20));

        librarian.booksReturnedInPeriod(LocalDate.of(2019, 6, 15),
                LocalDate.of(2019, 6, 22));
    }
}
