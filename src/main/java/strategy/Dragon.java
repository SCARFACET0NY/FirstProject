package strategy;

public class Dragon extends Creature {
    public Dragon(MoveStrategy strategy) {
        super(strategy);
    }

    @Override
    void move() {
        System.out.println(Dragon.class.getSimpleName() + getStrategy().move());
    }
}
