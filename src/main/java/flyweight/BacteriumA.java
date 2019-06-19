package flyweight;

public class BacteriumA implements Bacterium{
    public static final int BREEDING_RATE = 50;
    private int time;

    public BacteriumA(int time) {
        this.time = time;
    }

    @Override
    public int breed() {
        return BREEDING_RATE * time;
    }
}
