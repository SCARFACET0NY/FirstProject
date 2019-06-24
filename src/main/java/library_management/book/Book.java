package library_management.book;

import library_management.book.Author;

import java.util.List;

public abstract class Book {
    private String title;
    private String ISBN;
    private int yearOfPublication;
    private String placeOfPublication;
    private String publishingHouse;
    private List<Author> authors;
    private String text;

    public Book(String title,
                String ISBN,
                int yearOfPublication,
                String placeOfPublication,
                String publishingHouse,
                List<Author> authors,
                String text) {
        this.title = title;
        this.ISBN = ISBN;
        this.yearOfPublication = yearOfPublication;
        this.placeOfPublication = placeOfPublication;
        this.publishingHouse = publishingHouse;
        this.authors = authors;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPlaceOfPublication() {
        return placeOfPublication;
    }

    public void setPlaceOfPublication(String placeOfPublication) {
        this.placeOfPublication = placeOfPublication;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
