package recipe;

import java.time.LocalDate;

public class DoctorRecipe implements Recipe {
    private LocalDate expiration;
    private String text;

    public DoctorRecipe(LocalDate expiration, String text) {
        this.expiration = expiration;
        this.text = text;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public String getText() {
        return text;
    }

    @Override
    public void display() {
        System.out.println(text + " expires " + expiration);
    }
}
