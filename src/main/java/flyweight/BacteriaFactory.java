package flyweight;

import java.util.ArrayList;
import java.util.List;

public class BacteriaFactory {
    private List<Bacterium> bacteria = new ArrayList<>();

    public Bacterium createBacterium(BacteriumType type, int time) {
        Bacterium bacterium = null;

        if (type == BacteriumType.BACTERIUM_A) {
            bacterium = new BacteriumA(time);
        } else if (type == BacteriumType.BACTERIUM_B) {
            bacterium = new BacteriumB(time);
        }

        bacteria.add(bacterium);

        return bacterium;
    }

    public List<Bacterium> getBacteria() {
        return bacteria;
    }
}
