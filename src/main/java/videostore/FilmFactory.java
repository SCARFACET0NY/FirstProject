package videostore;

public abstract class FilmFactory {
    private static FilmFactory englishFilmFactory = null;
    private static FilmFactory russianFilmFactory = null;
    private static FilmFactory ukrainianFilmFactory = null;

    public abstract Soundtrack getSoundtrack();
    public abstract Subtitles getSubtitles();

    public static FilmFactory getFactory(String soundtrackLanguage) {
        if (soundtrackLanguage == null) return null;

        FilmFactory factory = null;

        switch (soundtrackLanguage.toLowerCase()) {
            case "english":
                if (englishFilmFactory == null) {
                    englishFilmFactory = new EnglishFilmFactory();
                }
                factory = englishFilmFactory;
                break;
            case "russian":
                if (russianFilmFactory == null) {
                    russianFilmFactory = new RussianFilmFactory();
                }
                factory = russianFilmFactory;
                break;
            case "ukrainian":
                if (ukrainianFilmFactory == null) {
                    ukrainianFilmFactory = new UkrainianFilmFactory();
                }
                factory = ukrainianFilmFactory;
                break;
        }

        return factory;
    }
}
