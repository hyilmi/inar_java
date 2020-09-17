package chapter8;

import java.util.Scanner;

public class Exercise08_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of matrix (minimum 4): ");
		int size = input.nextInt();
		
		int[][] m = new int[size][size];
		
		if (isConsecutiveFour(m)) {
			System.out.println("This matrix has four consecutive numbers with the same value.");
		}else {
			System.out.println("This matrix does not have four consecutive numbers with the same value.");
		}
		
				

	}

	public static boolean isConsecutiveFour(int[][] values) {
		return (horizontal(values) || vertical(values) || majorDiagonal(values) || subDiagonal(values));
	}

	private static boolean horizontal(int[][] values) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length - 3; j++) {
				if (values[i][j] == values[i][j + 1] && values[i][j + 1] == values[i][j + 2]
						&& values[i][j + 2] == values[i][j + 3]) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean vertical(int[][] values) {
		for (int i = 0; i < values.length - 3; i++) {
			for (int j = 0; j < values.length; j++) {
				if (values[j][i] == values[j][i + 1] && values[j][i + 1] == values[j][i + 2]
						&& values[j][i + 2] == values[j][i + 3]) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean majorDiagonal(int[][] values) {
		for (int i = 0; i < values.length - 3; i++) {
			for (int j = 0; j < values.length - 3; j++) {
				if (values[i][j] == values[i + 1][j + 1] && values[i + 1][j + 1] == values[i + 2][j + 2]
						&& values[i + 2][j + 2] == values[i + 3][j + 3]) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean subDiagonal(int[][] values) {
		for (int i = 0; i < values.length - 3; i++) {
			for (int j = values.length - 1; j >= 3; j--) {
				if (values[i][j] == values[i - 1][j - 1] && values[i - 1][j - 1] == values[i - 2][j - 2]
						&& values[i - 2][j - 2] == values[i - 3][j - 3]) {
					return true;
				}
			}
		}
		return false;
	}

}
