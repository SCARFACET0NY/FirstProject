package library_management;

import java.util.HashMap;

public class Reader implements Person {
    private String firstName;
    private String secondName;
    private String lastName;
    private LibraryCard readerCard;
    private HashMap<String, BookItem> books;

    public Reader(String firstName, String secondName, String lastName, LibraryCard readerCard) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.readerCard = readerCard;
        books = new HashMap<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LibraryCard getReaderCard() {
        return readerCard;
    }

    public void setReaderCard(LibraryCard readerCard) {
        this.readerCard = readerCard;
    }

    public void addBook(BookItem book) {
        books.put(book.getTitle(), book);
    }

    public BookItem returnBook(String title) {
        return books.remove(title);
    }

    public HashMap<String, BookItem> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, BookItem> books) {
        this.books = books;
    }

    @Override
    public String fullName() {
        return firstName + " " + secondName + " " + lastName;
    }
}
