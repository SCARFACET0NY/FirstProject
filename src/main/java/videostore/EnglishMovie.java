package videostore;

public class EnglishMovie extends MovieFactory {
    @Override
    public Soundtrack getSoundtrack() {
        return new EnglishSoundtrack();
    }

    @Override
    public Subtitles getSubtitles() {
        return new EnglishSubtitles();
    }
}
