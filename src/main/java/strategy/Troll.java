package strategy;

public class Troll extends Creature {
    public Troll(MoveStrategy flightStrategy) {
        super(flightStrategy);
    }

    @Override
    void move() {
        System.out.println(Troll.class.getSimpleName() + getStrategy().move());
    }
}
