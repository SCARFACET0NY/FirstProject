package tetris;

public class SFigure implements Figure {
    private String figure;

    SFigure(boolean superFigure) {
        this.figure = superFigure ? "  ****\n  ****\n****  \n****  " : " **\n** ";
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
