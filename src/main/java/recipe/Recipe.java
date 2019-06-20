package recipe;

import java.time.LocalDate;

public interface Recipe {
    void display();
    String getText();
    LocalDate getExpiration();
}
