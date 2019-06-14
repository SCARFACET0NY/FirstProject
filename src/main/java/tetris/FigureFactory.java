package tetris;

public class FigureFactory {
    public static Figure createFigure(String figureType, boolean superFigure) {
        Figure figure = null;

        switch (figureType.toUpperCase()) {
            case "I":
                figure = new IFigure(superFigure);
                break;
            case "J":
                figure = new JFigure(superFigure);
                break;
            case "L":
                figure = new LFigure(superFigure);
                break;
            case "O":
                figure = new OFigure(superFigure);
                break;
            case "S":
                figure = new SFigure(superFigure);
                break;
            case "T":
                figure = new TFigure(superFigure);
                break;
            case "Z":
                figure = new ZFigure(superFigure);
                break;
        }

        return figure;
    }
}
