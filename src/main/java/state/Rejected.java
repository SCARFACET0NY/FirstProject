package state;

public class Rejected implements GrantState {
    @Override
    public GrantState next() {
        System.out.println("Your grant is rejected");
        return null;
    }

    @Override
    public void show() {
        System.out.println("Grant is rejected");
    }
}
