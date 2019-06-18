package state;

public class GrantContext implements GrantState {
    private GrantState currentState;

    public GrantState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GrantState currentState) {
        this.currentState = currentState;
    }

    @Override
    public void show() {
        currentState.show();
    }
}
