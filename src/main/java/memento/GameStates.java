package memento;

import java.util.ArrayList;
import java.util.List;

public class GameStates {
    private static List<Memento> gameStates = new ArrayList<>();

    public static void addGameState(Memento gameState) {
        gameStates.add(gameState);
    }

    public static Memento getGameState() {
        return gameStates.get(gameStates.size() - 1);
    }
}
