package library_management;

public interface Search {
    boolean searchBookByTitle(String title);

    boolean searchBookByISBN(String ISBN);
}
