package videostore;

public class Client {
    public static void main(String[] args) {
        FilmFactory filmFactory = FilmFactory.getFactory("english");
        Soundtrack soundtrack = filmFactory.getSoundtrack();
        Subtitles subtitles = filmFactory.getSubtitles();

        System.out.println(soundtrack.play());
        System.out.println(subtitles.show());

        filmFactory = FilmFactory.getFactory("russian");
        soundtrack = filmFactory.getSoundtrack();
        subtitles = filmFactory.getSubtitles();

        System.out.println(soundtrack.play());
        System.out.println(subtitles.show());
    }
}
