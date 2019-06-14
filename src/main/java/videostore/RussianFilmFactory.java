package videostore;

public class RussianFilmFactory extends FilmFactory {
    @Override
    public Soundtrack getSoundtrack() {
        return new RussianSoundtrack();
    }

    @Override
    public Subtitles getSubtitles() {
        return new RussianSubtitles();
    }
}
