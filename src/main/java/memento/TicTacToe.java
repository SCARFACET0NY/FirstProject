package memento;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    public void setGameState(char[][] board) {
        this.board = board;
    }

    public Memento save() {
        return new Memento(board);
    }

    public void restore(Memento memento) {
        setGameState(memento.getGameState());
        printBoard();
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
        printBoard();
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

            System.out.println("undo turn? (y/n) ");
            String answer = scanner.next();
            if (answer.toLowerCase().trim().equals("y")) {
                count--;
                restore(GameStates.getGameState());
            }
        }
        System.out.println("You won");
    }
}
