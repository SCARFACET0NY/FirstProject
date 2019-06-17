package strategy;

public class Witch extends Creature {
    public Witch(MoveStrategy flightStrategy) {
        super(flightStrategy);
    }

    @Override
    void move() {
        System.out.println(Witch.class.getSimpleName() + getStrategy().move());
    }
}
