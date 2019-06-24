package library_management.factory;

import library_management.book.Author;
import library_management.book.BookItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BookItemFactory {
    private static final HashMap<String, BookItem> bookPrototypes = new HashMap<>();

    static {
        bookPrototypes.put("book 1", new BookItem(1, "book 1", "111-222-333", 2015,
                "Place 1", "Publishing house 1",
                new ArrayList<>(Arrays.asList(new Author("First Name 1", "Last Name 1",
                        "Biography 1"))),
                "text 1"));
        bookPrototypes.put("book 2", new BookItem(1, "book 2", "222-333-444", 2016,
                "Place 2", "Publishing house 2",
                new ArrayList<>(Arrays.asList(new Author("First Name 2", "Last Name 2",
                        "Biography 2"))),
                "text 2"));
        bookPrototypes.put("book 3", new BookItem(1, "book 3", "333-444-555", 2017,
                "Place 3", "Publishing house 3",
                new ArrayList<>(Arrays.asList(new Author("First Name 3", "Last Name 3",
                        "Biography 3"), new Author("First Name 2", "Last Name 2",
                        "Biography 2"))),
                "text 3"));
        bookPrototypes.put("book 4", new BookItem(1, "book 4", "444-555-666", 2018,
                "Place 4", "Publishing house 4",
                new ArrayList<>(Arrays.asList(new Author("First Name 4", "Last Name 4",
                        "Biography 4"))),
                "text 4"));
    }

    public static BookItem getBookItem(String title) {
        return bookPrototypes.get(title).clone();
    }

    public static HashMap<String, BookItem> getBookPrototypes() {
        return bookPrototypes;
    }

    public static void addBookItemToPrototypes(BookItem bookItem) {
        bookPrototypes.put(bookItem.getTitle(), bookItem);
    }
}
