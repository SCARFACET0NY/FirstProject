package state;

public class GrantClient {
    public static void main(String[] args) {
        GrantContext grantContext = new GrantContext();

        grantContext.setCurrentState(new Created());
        grantContext.show();

        grantContext.setCurrentState(new Pending());
        grantContext.show();

        grantContext.setCurrentState(new Approved());
        grantContext.show();

        grantContext.setCurrentState(new Rejected());
        grantContext.show();
    }
}
