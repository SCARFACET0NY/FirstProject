package tetris;

public class JFigure implements Figure {
    private String figure;

    JFigure(boolean superFigure) {
        this.figure = superFigure ? "    **\n    **\n******\n******" : "  *\n***";
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
