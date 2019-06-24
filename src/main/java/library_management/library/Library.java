package library_management.library;

import library_management.book.BookItem;
import library_management.book.BookStatus;
import library_management.interfaces.Person;
import library_management.interfaces.Search;
import library_management.reader.LibraryCard;
import library_management.reader.Reader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private List<Reader> registeredUsers;
    private Catalog booksCatalog;
    private HashMap<Long, List<BookLending>> bookLendings;

    public class Librarian implements Person, Search {
        private String firstName;
        private String lastName;

        public Librarian(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void addReader(Reader reader) {
            registeredUsers.add(reader);
            bookLendings.put(reader.getReaderCard().getCardNumber(), new ArrayList<>());
        }

        public void removeReader(Reader reader) {
            registeredUsers.remove(reader);
        }

        public void changerReadersFirstName(Reader reader, String firstName) {
            registeredUsers.get(registeredUsers.indexOf(reader)).setFirstName(firstName);
        }

        public void changerReadersSecondName(Reader reader, String secondName) {
            registeredUsers.get(registeredUsers.indexOf(reader)).setSecondName(secondName);
        }

        public void changerReadersLastName(Reader reader, String lastName) {
            registeredUsers.get(registeredUsers.indexOf(reader)).setLastName(lastName);
        }

        public void changerReadersLibraryCard(Reader reader, LibraryCard card) {
            registeredUsers.get(registeredUsers.indexOf(reader)).setReaderCard(card);
        }

        public void addBook(BookItem book) {
            booksCatalog.addBook(book);
        }

        public void removeBook(BookItem book) {
            booksCatalog.removeBook(book);
        }

        public void addBookItems(String title, int count) {
            booksCatalog.addBookItems(title, count);
        }

        public void removeBookItems(String title, int count) {
            booksCatalog.removeBookItems(title, count);
        }

        public int getBookCount(String title) {
            return booksCatalog.getBookCount(title);
        }

        public int getAvailableBooksCount(String title) {
            return booksCatalog.getAvailableBooksCount(title);
        }

        public void checkoutBooks(Reader reader, LocalDate creationDate, LocalDate dueDate, String ...titles) {
            BookLending bookLending = new BookLending(reader, creationDate, dueDate);

            for (String title : titles) {
                bookLending.getLentBookTitles().add(title);

                BookItem book = booksCatalog.checkoutBook(title);
                book.setBorrowed(creationDate);
                book.setDueDate(dueDate);
                book.setStatus(BookStatus.LOANED);

                reader.addBook(book);

            }

            bookLendings.get(reader.getReaderCard().getCardNumber()).add(bookLending);
        }

        public void returnBooks(Reader reader, LocalDate returnDate, String ...titles) {
            for (String title : titles) {
                BookItem book = reader.returnBook(title);
                book.setBorrowed(null);
                book.setDueDate(null);
                book.setStatus(BookStatus.AVAILABLE);

                booksCatalog.returnBook(book);
            }

            BookLending bookLending = bookLendings.get(reader.getReaderCard().getCardNumber())
                    .get(bookLendings.get(reader.getReaderCard().getCardNumber()).size() - 1);
            bookLending.setReturnDate(returnDate);
            bookLending.setActive(false);
        }

        public void booksCheckedOutInPeriod(LocalDate from, LocalDate to) {
            System.out.println("Books checked out from " + from + " to " + to + ": ");
            int count = 0;

            for (Reader reader : registeredUsers) {
                for (BookLending lending : bookLendings.get(reader.getReaderCard().getCardNumber())) {
                    LocalDate date = lending.getCreationDate();

                    if (date.isAfter(from) && date.isBefore(to) || date.isEqual(from) || date.isEqual(to)) {
                        for (String title : lending.getLentBookTitles()) {
                            System.out.println(title);
                            count++;
                        }
                    }
                }
            }

            if (count == 0) System.out.println("No checked out books in this period");
        }

        public void booksReturnedInPeriod(LocalDate from, LocalDate to) {
            System.out.println("Books returned out from " + from + " to " + to + ": ");
            int count = 0;

            for (Reader reader : registeredUsers) {
                for (BookLending lending : bookLendings.get(reader.getReaderCard().getCardNumber())) {
                    if (lending.isActive()) continue;;
                    LocalDate date = lending.getReturnDate();

                    if (date.isAfter(from) && date.isBefore(to) || date.isEqual(from) || date.isEqual(to)) {
                        for (String title : lending.getLentBookTitles()) {
                            System.out.println(title);
                            count++;
                        }
                    }
                }
            }

            if (count == 0) System.out.println("No returned out books in this period");
        }

        public void booksLentByReaderNow (Reader reader) {
            if (reader.getBooks().keySet().isEmpty()) System.out.println("No lent books at the moment");
            else reader.getBooks().keySet().forEach(System.out::println);
        }

        public boolean isBookAvailable(String title) {
            return getAvailableBooksCount(title) > 0;
        }

        @Override
        public String fullName() {
            return firstName + " " + lastName;
        }

        @Override
        public boolean searchBookByTitle(String title) {
            return booksCatalog.searchBookByTitle(title);
        }

        @Override
        public boolean searchBookByISBN(String ISBN) {
            return booksCatalog.searchBookByISBN(ISBN);
        }
    }

    public Library() {
        this.registeredUsers = new ArrayList<>();
        this.booksCatalog = new Catalog();
        this.bookLendings = new HashMap<>();
    }

    public List<Reader> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(List<Reader> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public Catalog getBooksCatalog() {
        return booksCatalog;
    }

    public void setBooksCatalog(Catalog booksCatalog) {
        this.booksCatalog = booksCatalog;
    }

    public HashMap<Long, List<BookLending>> getBookLendings() {
        return bookLendings;
    }

    public void setBookLendings(HashMap<Long, List<BookLending>> bookLendings) {
        this.bookLendings = bookLendings;
    }
}
