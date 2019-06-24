package library_management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookLending {
    private LocalDate creationDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private List<String> lentBookTitles;
    private Reader lendingReader;
    private boolean active;

    public BookLending(Reader reader, LocalDate creationDate, LocalDate dueDate) {
        lentBookTitles = new ArrayList<>();
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.lendingReader = reader;
        active = true;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Reader getLendingReader() {
        return lendingReader;
    }

    public void setLendingReader(Reader lendingReader) {
        this.lendingReader = lendingReader;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<String> getLentBookTitles() {
        return lentBookTitles;
    }

    public void setLentBookTitles(List<String> lentBookTitles) {
        this.lentBookTitles = lentBookTitles;
    }
}
