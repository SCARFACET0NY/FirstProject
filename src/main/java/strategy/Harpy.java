package strategy;

public class Harpy extends Creature {
    public Harpy(MoveStrategy flightStrategy) {
        super(flightStrategy);
    }

    @Override
    void move() {
        System.out.println(Harpy.class.getSimpleName() + getStrategy().move());
    }
}
