package state;

public class Pending implements GrantState {
    @Override
    public GrantState next() {
        return new Approved();
    }

    @Override
    public void show() {
        System.out.println("Grant is pending");
    }
}
