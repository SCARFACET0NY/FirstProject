package observer;

import java.util.List;

public class MagazineSubscriber implements Observer {
    private String name;
    private String address;

    @Override
    public void update(PostOffice post) {
        checkMagazines(post.getMagazinesState());
    }

    public void checkMagazines(List<Magazine> magazines) {
        System.out.println("You've received a magazine " + magazines.get(magazines.size() - 1).getTitle());
    }
}
