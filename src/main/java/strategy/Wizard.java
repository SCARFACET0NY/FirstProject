package strategy;

public class Wizard extends Creature {
    public Wizard(MoveStrategy flightStrategy) {
        super(flightStrategy);
    }

    @Override
    void move() {
        System.out.println(Wizard.class.getSimpleName() + getStrategy().move());
    }
}
