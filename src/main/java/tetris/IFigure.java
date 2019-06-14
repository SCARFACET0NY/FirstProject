package tetris;

public class IFigure implements Figure {
    private String figure;

    IFigure(boolean superFigure) {
        this.figure = superFigure ? "********\n********" : "****";
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
