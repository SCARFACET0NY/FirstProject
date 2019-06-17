package strategy;

public abstract class Creature {
    private MoveStrategy strategy;

    public Creature(MoveStrategy flightStrategy) {
        this.strategy = flightStrategy;
    }

    public MoveStrategy getStrategy() {
        return strategy;
    }

    abstract void move();
}
