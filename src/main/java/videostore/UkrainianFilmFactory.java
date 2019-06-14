package videostore;

public class UkrainianFilmFactory extends FilmFactory {

    @Override
    public Soundtrack getSoundtrack() {
        return new UkrainianSoundtrack();
    }

    @Override
    public Subtitles getSubtitles() {
        return new UkrainianSubtitles();
    }
}
