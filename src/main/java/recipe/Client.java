package recipe;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        Recipe doctorRecipe = new DoctorRecipe(LocalDate.of(2019, 6, 25), "Some recipe");
        doctorRecipe.display();

        Recipe proxyRecipe = new ProxyRecipe(doctorRecipe, 7);
        proxyRecipe.display();
    }
}
