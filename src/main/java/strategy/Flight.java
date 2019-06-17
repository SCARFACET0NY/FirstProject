package strategy;

public class Flight implements MoveStrategy {
    @Override
    public String move() {
        return " flies";
    }
}
