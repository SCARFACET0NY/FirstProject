package state;

public class GrantClient {
    public static void main(String[] args) {
        GrantContext grantContext = new GrantContext();

        grantContext.setCurrentState(new Rejected());
        grantContext.show();
        grantContext.next();

        grantContext.setCurrentState(new Created());
        grantContext.show();
        grantContext.next();
        grantContext.show();
        grantContext.next();
        grantContext.show();
        grantContext.next();
    }
}
