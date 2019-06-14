package tetris;

public class ZFigure implements Figure {
    private String figure;

    ZFigure(boolean superFigure) {
        this.figure = superFigure ? "****  \n****  \n  ****\n  ****" : "** \n **";
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
