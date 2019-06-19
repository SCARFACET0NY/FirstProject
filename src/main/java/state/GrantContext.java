package state;

public class GrantContext {
    private GrantState currentState;

    public GrantState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GrantState currentState) {
        this.currentState = currentState;
    }

    public void next() {
        currentState = currentState.next();
    }

    public void show() {
        currentState.show();
    }
}
