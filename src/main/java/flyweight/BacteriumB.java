package flyweight;

public class BacteriumB implements Bacterium {
    public static final int BREEDING_RATE = 100;
    private int time;

    public BacteriumB(int time) {
        this.time = time;
    }

    @Override
    public int breed() {
        return BREEDING_RATE * time;
    }
}
