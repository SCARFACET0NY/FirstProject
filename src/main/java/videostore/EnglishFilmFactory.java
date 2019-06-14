package videostore;

public class EnglishFilmFactory extends FilmFactory {
    @Override
    public Soundtrack getSoundtrack() {
        return new EnglishSoundtrack();
    }

    @Override
    public Subtitles getSubtitles() {
        return new EnglishSubtitles();
    }
}
