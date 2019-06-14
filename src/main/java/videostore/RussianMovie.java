package videostore;

public class RussianMovie extends MovieFactory {
    @Override
    public Soundtrack getSoundtrack() {
        return new RussianSoundtrack();
    }

    @Override
    public Subtitles getSubtitles() {
        return new RussianSubtitles();
    }
}
