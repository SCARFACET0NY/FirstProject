package state;

public class Created implements GrantState {
    @Override
    public void show() {
        System.out.println("Grant is created");
    }
}
