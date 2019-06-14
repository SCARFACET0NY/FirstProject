package videostore;

public abstract class MovieFactory {
    private static MovieFactory englishFilm = null;
    private static MovieFactory russianFilm = null;
    private static MovieFactory ukrainianFilm = null;

    public abstract Soundtrack getSoundtrack();
    public abstract Subtitles getSubtitles();

    public static MovieFactory getMovie(String soundtrackLanguage) {
        if (soundtrackLanguage == null) return null;

        MovieFactory movie = null;

        switch (soundtrackLanguage.toLowerCase()) {
            case "english":
                if (englishFilm == null) {
                    englishFilm = new EnglishMovie();
                }
                movie = englishFilm;
                break;
            case "russian":
                if (russianFilm == null) {
                    russianFilm = new RussianMovie();
                }
                movie = russianFilm;
                break;
            case "ukrainian":
                if (ukrainianFilm == null) {
                    ukrainianFilm = new UkrainianMovie();
                }
                movie = ukrainianFilm;
                break;
        }

        return movie;
    }
}
