package library_management;

import java.time.LocalDate;

public class LibraryCard {
    private long cardNumber;
    private LocalDate issuedAt;

    public LibraryCard(long cardNumber, LocalDate issuedAt) {
        this.cardNumber = cardNumber;
        this.issuedAt = issuedAt;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(LocalDate issuedAt) {
        this.issuedAt = issuedAt;
    }
}
