package observer;

public interface Subject {
    void subscribe(SubscriptionType type, Observer observer);

    void unsubscribe(SubscriptionType type, Observer observer);

    void notifySubscribers(SubscriptionType type);
}
