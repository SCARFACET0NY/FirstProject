package state;

public class Approved implements GrantState {
    @Override
    public GrantState next() {
        System.out.println("Your grant is approved");
        return null;
    }

    @Override
    public void show() {
        System.out.println("Grant is approved");
    }
}
