package memento;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    private char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    public void setGameState(char[][] board) {
        this.board = board;
    }

    public Memento save() {
        char[][] state = new char[board.length][board.length];
        for (int i = 0; i < board.length; i++)
            state[i] = Arrays.copyOf(board[i], board[i].length);

        return new Memento(state);
    }

    public void restore(Memento memento) {
        setGameState(memento.getGameState());
    }

    public void printBoard() {
        for (char[] row: board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public void turn(char symbol, int x, int y) {
        board[x - 1][y - 1] = symbol;
    }

    public boolean checkWinner(char c) {
        return  board[0][0] == c && board[0][1] == c && board[0][2] == c ||
                board[1][0] == c && board[1][1] == c && board[1][2] == c ||
                board[2][0] == c && board[2][1] == c && board[2][2] == c ||
                board[0][0] == c && board[1][0] == c && board[2][0] == c ||
                board[0][1] == c && board[1][1] == c && board[2][1] == c ||
                board[0][2] == c && board[1][2] == c && board[2][2] == c ||
                board[0][0] == c && board[1][1] == c && board[2][2] == c ||
                board[0][2] == c && board[1][1] == c && board[2][0] == c;

    }

    public void play() {
        printBoard();
        int count = 0;
        char c = 'x';

        Scanner scanner = new Scanner(System.in);
        while (!checkWinner(c)) {
            GameStates.addGameState(save());

            System.out.println("Your turn: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            c = count % 2 == 0 ? 'x' : 'o';
            turn(c, x, y);
            count++;
            printBoard();

            System.out.println("undo turn? (y/n) ");
            String answer = scanner.next();
            if (answer.toLowerCase().trim().equals("y")) {
                count--;
                restore(GameStates.getGameState());
                printBoard();
            }
        }
        System.out.println("You won");
    }
}
