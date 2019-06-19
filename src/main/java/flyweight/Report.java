package flyweight;

import java.util.List;

public class Report {
    public static void createReport(List<Bacterium> bacteria) {
        for (Bacterium bacterium : bacteria) {
            System.out.println("Was created " + bacterium.breed() +
                    " of " + bacterium.getClass().getSimpleName() + " bacteria");
        }
    }
}
