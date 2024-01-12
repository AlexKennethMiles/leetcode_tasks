package math.my;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        printBoard(board);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // First player (X) move
            playerMove(board, 'X');
            printBoard(board);

            // Check if the first player wins
            if (isWinner(board, 'X')) {
                System.out.println("Player X wins!");
                break;
            }

            // Check if the board is full, resulting in a draw
            if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                break;
            }

            // Second player (O) move
            playerMove(board, 'O');
            printBoard(board);

            // Check if the second player wins
            if (isWinner(board, 'O')) {
                System.out.println("Player O wins!");
                break;
            }

            // Check if the board is full, resulting in a draw
            if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                break;
            }
        }

        scanner.close();
    }

    private static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void playerMove(char[][] board, char player) {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        do {
            System.out.println("Player " + player + ", enter your move (row and column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (!isValidMove(board, row, col));

        board[row][col] = player;
    }

    private static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ');
    }

    private static boolean isWinner(char[][] board, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Check diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
