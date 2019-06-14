package videostore;

public class Client {
    public static void main(String[] args) {
        MovieFactory film = MovieFactory.getMovie("english");
        Soundtrack soundtrack = film.getSoundtrack();
        Subtitles subtitles = film.getSubtitles();

        System.out.println(soundtrack.play());
        System.out.println(subtitles.show());

        film = MovieFactory.getMovie("russian");
        soundtrack = film.getSoundtrack();
        subtitles = film.getSubtitles();

        System.out.println(soundtrack.play());
        System.out.println(subtitles.show());
    }
}
