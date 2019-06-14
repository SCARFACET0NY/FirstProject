package tetris;

public class OFigure implements Figure {
    private String figure;

    OFigure(boolean superFigure) {
        this.figure = superFigure ? "* * * *\n* * * *\n* * * *\n* * * *" : "**\n**";
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
