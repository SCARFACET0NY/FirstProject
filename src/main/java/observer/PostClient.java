package observer;

public class PostClient {
    public static void main(String[] args) {
        PostOffice post = new PostOffice();
        Observer magazineSubscriber = new MagazineSubscriber();
        Observer newspaperSubscriber = new NewspaperSubscriber();

        post.subscribe(SubscriptionType.MAGAZINE, magazineSubscriber);
        post.subscribe(SubscriptionType.NEWSPAPER, newspaperSubscriber);

        post.addMagazine(new Magazine("My Magazine", "text 1"));
        post.addNewspaper(new Newspaper("My Newspaper", "text 2"));

        post.unsubscribe(SubscriptionType.MAGAZINE, magazineSubscriber);

        post.addMagazine(new Magazine("My Magazine 2", "text 3"));
        post.addNewspaper(new Newspaper("My Newspaper 2", "text 4"));
    }
}
