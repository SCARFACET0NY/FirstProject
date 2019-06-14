package tetris;

import java.util.Random;

public class TetrisClient {
    public static void main(String[] args) {
        String[] figures = {"I", "J", "L", "O", "S", "T", "Z"};
        Random random = new Random();

        System.out.println("Regular figure:");
        System.out.println(FigureFactory.createFigure(figures[random.nextInt(figures.length)], false));
        System.out.println();
        System.out.println("Super figure:");
        System.out.println(FigureFactory.createFigure(figures[random.nextInt(figures.length)], true));
    }
}
