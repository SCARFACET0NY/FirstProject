package library_management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Library.Librarian librarian = library.new Librarian();

        librarian.addBook(new BookItem(1, "book 1", "111-222-333", 2015,
                "Place 1", "Publishing house 1",
                new ArrayList<>(Arrays.asList(new Author("First Name 1", "Last Name 1", null))),
                "text 1"));
        librarian.addBookItems("book 1", 4);

        System.out.println(librarian.getBookCount("book 1"));

        Reader reader = new Reader("First 1", "Second 1", "Last 1",
                new LibraryCard(1, LocalDate.of(2019, 5, 15)));
        librarian.addReader(reader);
        librarian.checkoutBooks(reader, LocalDate.of(2019, 6, 15), LocalDate.of(2019, 6, 28), "book 1");
        librarian.returnBooks(reader, LocalDate.of(2019, 6, 24), "book 1");
        System.out.println(librarian.isBookAvailable("book 1"));

        System.out.println(librarian.getAvailableBooksCount("book 1"));
    }
}
