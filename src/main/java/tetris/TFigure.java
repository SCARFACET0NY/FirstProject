package tetris;

public class TFigure implements Figure {
    private String figure;

    TFigure(boolean superFigure) {
        this.figure = superFigure ? "  **  \n  **  \n******\n******" : " * \n***";
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
