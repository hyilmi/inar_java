package chapter8;

import java.util.Scanner;

public class Exercise08_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[][] board = new char[3][3];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ' ';
			}
		}

		boolean playerXWins = false;
		boolean playerOWins = false;

		while (playerXWins == false && playerOWins == false) {

			if (fullBoard(board)) {
				printBoard(board);
				System.out.println("It's a tie!");
				System.exit(0);
			}

			printBoard(board);

			System.out.print("Enter a row (0, 1, or 2) for player X: ");
			int rowX = input.nextInt();
			System.out.print("Enter a column (0, 1, or 2) for player X: ");
			int columnX = input.nextInt();

			if (board[rowX][columnX] == ' ') {
				board[rowX][columnX] = 'X';
			} else if (fullBoard(board)) {
				printBoard(board);
				System.out.println("It's a tie!");
				System.exit(0);
			} else {
				System.out.println("This spot is already filled in");
				continue;
			}

			playerXWins = checkBoard(board, 'X');

			if (playerXWins) {
				printBoard(board);
				System.out.println("Player X won!");
				System.exit(0);
			}

			printBoard(board);

			System.out.print("Enter a row (0, 1, or 2) for player O: ");
			int rowO = input.nextInt();
			System.out.print("Enter a column (0, 1, or 2) for player O: ");
			int columnO = input.nextInt();

			if (board[rowO][columnO] == ' ') {
				board[rowO][columnO] = 'O';
			} else if (fullBoard(board)) {
				printBoard(board);
				System.out.println("It's a tie!");
				System.exit(0);
			} else {
				System.out.println("This spot is already filled in");
				continue;
			}

			playerOWins = checkBoard(board, 'O');

			if (playerOWins) {
				printBoard(board);
				System.out.println("Player O won!");
				System.exit(0);
			}

		}

	}

	private static void printBoard(char[][] board) {
		System.out.println("-------------");
		System.out.printf("| %c | %c | %c |\n", board[0][0], board[0][1], board[0][2]);
		System.out.println("-------------");
		System.out.printf("| %c | %c | %c |\n", board[1][0], board[1][1], board[1][2]);
		System.out.println("-------------");
		System.out.printf("| %c | %c | %c |\n", board[2][0], board[2][1], board[2][2]);
	}

	private static boolean checkBoard(char[][] board, char ch) {
		return (checkRows(board, ch) || checkColumns(board, ch) || checkMajorDiagonal(board, ch)
				|| checkSubDiagonal(board, ch));
	}

	private static boolean checkRows(char[][] board, char ch) {
		for (int i = 0; i < board.length; i++) {
			if (ch == board[i][0] && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}
		return false;
	}

	private static boolean checkColumns(char[][] board, char ch) {
		for (int i = 0; i < board[0].length; i++) {
			if (ch == board[0][i] && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return true;
			}
		}
		return false;
	}

	private static boolean checkMajorDiagonal(char[][] board, char ch) {
		if (ch == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			return true;
		}
		return false;
	}

	private static boolean checkSubDiagonal(char[][] board, char ch) {
		if (ch == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return true;
		}
		return false;
	}

	private static boolean fullBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

}
