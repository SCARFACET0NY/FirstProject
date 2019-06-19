package strategy;

import java.util.List;

public class Wizard extends Creature {
    public Wizard(MoveStrategy flightStrategy) {
        super(flightStrategy);
    }

    @Override
    void move() {
        System.out.println(Wizard.class.getSimpleName() + getStrategy().move());
    }

    void flySpell(List<Creature> creatures) {
        for (Creature creature : creatures) {
            System.out.println(creature.getClass().getSimpleName() + getStrategy().move());
        }
    }
}
