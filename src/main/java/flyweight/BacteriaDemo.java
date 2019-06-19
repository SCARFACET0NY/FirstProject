package flyweight;

public class BacteriaDemo {
    public static void main(String[] args) {
        BacteriumType type;
        BacteriaFactory bacteriaFactory = new BacteriaFactory();

        for (int i = 1; i <= 20; i++) {
            type = i % 2 == 0 ? BacteriumType.BACTERIUM_A : BacteriumType.BACTERIUM_B;
            bacteriaFactory.createBacterium(type ,i);
        }

        Report.createReport(bacteriaFactory.getBacteria());
    }
}
