package library_management.interfaces;

public interface Search {
    boolean searchBookByTitle(String title);

    boolean searchBookByISBN(String ISBN);
}
