package state;

public class Approved implements GrantState {
    @Override
    public void show() {
        System.out.println("Grant is approved");
    }
}
