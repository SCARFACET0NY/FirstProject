package memento;

public class Memento {
    private char[][] gameState;

    public Memento(char[][] gameState) {
        this.gameState = gameState;
    }

    public char[][] getGameState() {
        return gameState;
    }
}
