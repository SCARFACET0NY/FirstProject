package strategy;

public class Orc extends Creature {
    public Orc(MoveStrategy flightStrategy) {
        super(flightStrategy);
    }

    @Override
    void move() {
        System.out.println(Orc.class.getSimpleName() + getStrategy().move());
    }
}
