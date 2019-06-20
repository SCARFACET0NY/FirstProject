package recipe;

import java.time.LocalDate;

public class ProxyRecipe implements Recipe {
    private LocalDate expiration;
    private String text;
    private Recipe recipe;

    public ProxyRecipe(Recipe recipe, int days) {
        this.recipe = new DoctorRecipe(recipe.getExpiration().plusDays(days), recipe.getText());
        this.expiration = recipe.getExpiration();
        this.text = recipe.getText();
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public String getText() {
        return text;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    @Override
    public void display() {
        recipe.display();
    }
}
