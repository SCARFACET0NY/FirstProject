package library_management;

import java.time.LocalDate;
import java.util.List;

public class BookItem extends Book {
    private int barCode;
    private LocalDate borrowed;
    private LocalDate dueDate;
    private BookStatus status;

    public BookItem(int barCode,
                    String title,
                    String ISBN,
                    int yearOfPublication,
                    String placeOfPublication,
                    String publishingHouse,
                    List<Author> authors,
                    String text) {
        super(title, ISBN, yearOfPublication, placeOfPublication, publishingHouse, authors, text);
        this.barCode = barCode;
        status = BookStatus.AVAILABLE;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public LocalDate getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(LocalDate borrowed) {
        this.borrowed = borrowed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
