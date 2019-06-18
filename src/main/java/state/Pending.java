package state;

public class Pending implements GrantState {
    @Override
    public void show() {
        System.out.println("Grant is pending");
    }
}
