package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class GameClient {
    public static void main(String[] args) {
        Orc orc = new Orc(new Walk());
        Troll troll = new Troll(new Walk());
        Harpy harpy = new Harpy(new Flight());
        Dragon dragon = new Dragon(new WalkAndFlight());
        Witch witch= new Witch(new MagicFlight());
        Wizard wizard = new Wizard(new MagicFlight());

        orc.move();
        troll.move();
        harpy.move();
        dragon.move();
        witch.move();
        wizard.move();

        wizard.flySpell(new ArrayList<>(Arrays.asList(orc, troll)));
    }
}
