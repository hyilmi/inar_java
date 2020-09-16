package chapter8;

import java.util.Scanner;

public class Exercise08_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size for the matrix: ");
		int size = input.nextInt();

		int[][] m = new int[size][size];

		// generate matrix
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}

		// print matrix
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}

		// check for all 0's or all 1's in rows
		boolean noSameNumberOnRow = true;
		for (int i = 0; i < m.length; i++) {
			int zeroes = 0;
			int ones = 0;

			// count 0's and 1's on each row
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 0) {
					zeroes++;
				} else {
					ones++;
				}
			}

			// if its all 0's...
			if (zeroes == m[i].length) {
				noSameNumberOnRow = false;
				System.out.println("All 0's on row " + i);
			}

			// if its all 1's...
			if (ones == m[i].length) {
				noSameNumberOnRow = false;
				System.out.println("All 1's on row " + i);
			}

		}

		if (noSameNumberOnRow) {
			System.out.println("No same numbers on a row");
		}

		// check for all 0's or all 1's in columns
		boolean noSameNumbersOnColumn = true;
		for (int i = 0; i < m[0].length; i++) {
			int zeroes = 0;
			int ones = 0;

			for (int j = 0; j < m.length; j++) {
				if (m[j][i] == 0) {
					zeroes++;
				} else {
					ones++;
				}
			}

			if (zeroes == m.length) {
				noSameNumbersOnColumn = false;
				System.out.println("All 0's on column " + i);
			}
			if (ones == m.length) {
				noSameNumbersOnColumn = false;
				System.out.println("All 1's on column " + i);
			}

		}

		if (noSameNumbersOnColumn) {
			System.out.println("No same number on a column");
		}

		// check for all 0's or all 1's on the major diagonal
		boolean noSameNumbersOnMajorDiagonal = true;
		for (int i = 0; i < m.length; i++) {
			int zeroes = 0;
			int ones = 0;

			if (m[i][i] == 0) {
				zeroes++;
			} else {
				ones++;
			}

			if (zeroes == m.length) {
				noSameNumbersOnMajorDiagonal = false;
				System.out.println("All 0's on the major diagonal");
			}

			if (ones == m.length) {
				noSameNumbersOnMajorDiagonal = false;
				System.out.println("All 1's on the major diagonal");
			}
		}

		if (noSameNumbersOnMajorDiagonal) {
			System.out.println("No same numbers on the major diagonal");
		}

		// check for all 0's or all 1's on the sub-diagonal
		boolean noSameNumbersOnSubDiagonal = true;
		for (int i = 0, j = m[i].length - 1; i < m.length; i++, j--) {
			int zeroes = 0;
			int ones = 0;

			if (m[i][j] == 0) {
				zeroes++;
			} else {
				ones++;
			}

			if (zeroes == m.length) {
				noSameNumbersOnSubDiagonal = false;
				System.out.println("All 0's on the sub diagonal");
			}

			if (ones == m.length) {
				noSameNumbersOnSubDiagonal = false;
				System.out.println("All 1's on the sub diagonal");
			}
		}

		if (noSameNumbersOnSubDiagonal) {
			System.out.println("No same numbers on the sub diagonal");
		}

	}

}
