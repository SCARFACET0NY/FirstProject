package videostore;

public class UkrainianMovie extends MovieFactory {

    @Override
    public Soundtrack getSoundtrack() {
        return new UkrainianSoundtrack();
    }

    @Override
    public Subtitles getSubtitles() {
        return new UkrainianSubtitles();
    }
}
