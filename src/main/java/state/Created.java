package state;

public class Created implements GrantState {
    @Override
    public GrantState next() {
        return new Pending();
    }

    @Override
    public void show() {
        System.out.println("Grant is created");
    }
}
