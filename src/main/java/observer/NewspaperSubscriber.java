package observer;

import java.util.List;

public class NewspaperSubscriber implements Observer {
    public String name;
    private String address;

    @Override
    public void update(PostOffice post) {
        checkNewspapers(post.getNewspapersState());
    }

    public void checkNewspapers(List<Newspaper> newspapers) {
        System.out.println("You've received a magazine " + newspapers.get(newspapers.size() - 1).getTitle());
    }
}
