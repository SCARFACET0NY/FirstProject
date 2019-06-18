package state;

public class Rejected implements GrantState {
    @Override
    public void show() {
        System.out.println("Grant is rejected");
    }
}
