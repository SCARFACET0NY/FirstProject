package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostOffice implements Subject {
    private List<Magazine> magazines;
    private List<Newspaper> newspapers;
    private Map<SubscriptionType, List<Observer>> subscribers;

    public PostOffice() {
        magazines = new ArrayList<>();
        newspapers = new ArrayList<>();
        subscribers = new HashMap<>();
        subscribers.put(SubscriptionType.MAGAZINE, new ArrayList<>());
        subscribers.put(SubscriptionType.NEWSPAPER, new ArrayList<>());
    }

    @Override
    public void subscribe(SubscriptionType type, Observer subscriber) {
        List<Observer> observers = subscribers.get(type);
        observers.add(subscriber);
    }

    @Override
    public void unsubscribe(SubscriptionType type, Observer subscriber) {
        List<Observer> observers = subscribers.get(type);
        observers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(SubscriptionType type) {
        for (Observer subscriber : subscribers.get(type)) {
            subscriber.update(this);
        }
    }

    public List<Magazine> getMagazinesState() {
        return magazines;
    }

    public List<Newspaper> getNewspapersState() {
        return newspapers;
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
        notifySubscribers(SubscriptionType.MAGAZINE);
    }

    public void addNewspaper(Newspaper newspaper) {
        newspapers.add(newspaper);
        notifySubscribers(SubscriptionType.NEWSPAPER);
    }
}
