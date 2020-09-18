package chapter8;

import java.util.Scanner;

public class Exercise08_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[][] board = new char[6][7];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ' ';
			}
		}

		boolean playerRWins = false;
		boolean playerYWins = false;

		while (playerRWins == false && playerYWins == false) {

			printBoard(board);

			System.out.print("Drop a red disk at column (0-6): ");
			int RColumn = input.nextInt();
			
			// TODO: what if the column is full?
			// TODO: extract method
			for (int i = board.length - 1; i >= 0; i--) {
				if (board[i][RColumn] == ' ') {
					board[i][RColumn] = 'R';
					break;
				}
			}

			if (checkBoard(board, 'R')) {
				printBoard(board);
				System.out.println("Red player wins!");
				System.exit(0);
			}

			printBoard(board);

			System.out.print("Drop a yellow disk at column (0-6): ");
			int YColumn = input.nextInt();
			
			// TODO: what if the column is full?
			// TODO: extract method
			for (int i = board.length - 1; i >= 0; i--) {
				if (board[i][YColumn] == ' ') {
					board[i][YColumn] = 'Y';
					break;
				}
			}

			if (checkBoard(board, 'Y')) {
				printBoard(board);
				System.out.println("Yellow player wins!");
				System.exit(0);
			}

		}

	}

	private static void printBoard(char[][] board) {
		System.out.printf("|%c|%c|%c|%c|%c|%c|%c|\n", board[0][0], board[0][1], board[0][2], board[0][3], board[0][4],
				board[0][5], board[0][6]);
		System.out.printf("|%c|%c|%c|%c|%c|%c|%c|\n", board[1][0], board[1][1], board[1][2], board[1][3], board[1][4],
				board[1][5], board[1][6]);
		System.out.printf("|%c|%c|%c|%c|%c|%c|%c|\n", board[2][0], board[2][1], board[2][2], board[2][3], board[2][4],
				board[2][5], board[2][6]);
		System.out.printf("|%c|%c|%c|%c|%c|%c|%c|\n", board[3][0], board[3][1], board[3][2], board[3][3], board[3][4],
				board[3][5], board[3][6]);
		System.out.printf("|%c|%c|%c|%c|%c|%c|%c|\n", board[4][0], board[4][1], board[4][2], board[4][3], board[4][4],
				board[4][5], board[4][6]);
		System.out.printf("|%c|%c|%c|%c|%c|%c|%c|\n", board[5][0], board[5][1], board[5][2], board[5][3], board[5][4],
				board[5][5], board[5][6]);
		System.out.printf("---------------\n");
	}

	private static boolean checkBoard(char[][] board, char ch) {
		return (checkRows(board, ch) || checkColumns(board, ch) || checkMajorDiagonal(board, ch)
				|| checkSubDiagonal(board, ch));
	}

	private static boolean checkRows(char[][] board, char ch) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length - 3; j++) {
				if (ch == board[i][j] && board[i][j] == board[i][j + 1] && board[i][j + 1] == board[i][j + 2]
						&& board[i][j + 2] == board[i][j + 3]) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean checkColumns(char[][] board, char ch) {
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board.length - 3; j++) {
				if (ch == board[j][i] && board[j][i] == board[j + 1][i] && board[j + 1][i] == board[j + 2][i]
						&& board[j + 2][i] == board[j + 3][i]) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean checkMajorDiagonal(char[][] board, char ch) {
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = 0; j < board[i].length - 3; j++) {
				if (ch == board[i][j] && board[i][j] == board[i + 1][j + 1]
						&& board[i + 1][j + 1] == board[i + 2][j + 2] && board[i + 2][j + 2] == board[i + 3][j + 3]) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean checkSubDiagonal(char[][] board, char ch) {
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = board[i].length - 1; j >= 3; j--) {
				if (ch == board[i][j] && board[i][j] == board[i + 1][j - 1]
						&& board[i + 1][j - 1] == board[i + 2][j - 2] && board[i + 2][j - 2] == board[i + 3][j - 3]) {
					return true;
				}
			}
		}
		return false;
	}

}
