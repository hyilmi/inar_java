package chapter8;

public class Exercise08_10 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];

		// create arrays for rows and columns to hold the amount of 1's for each row or column
		int[] rowCount = new int[4];
		int[] columnCount = new int[4];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);
			}
		}
		
		
		int maxRow = 0;
		int maxRowIndex = 0;
		for (int row = 0; row < matrix.length; row++) {
			int count = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == 1) {
					count++;
				}
			}
			if (count > maxRow) {
				maxRow = count;
				maxRowIndex = row;
			}
		}

		int maxColumn = 0;
		int maxColumnIndex = 0;
		for (int column = 0; column < matrix[0].length; column++) {
			int count = 0;
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][column] == 1) {
					count++;
				}
			}

			if (count > maxColumn) {
				maxColumn = count;
				maxColumnIndex = column;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("Maximum row index: " + maxRowIndex);
		System.out.println("Maximum column index: " + maxColumnIndex);

	}

}
