package tetris;

public class LFigure implements Figure {
    private String figure;

    LFigure(boolean superFigure) {
        this.figure = superFigure ? "**    \n**    \n******\n******" : "*  \n***";
    }

    @Override
    public String getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return figure;
    }
}
