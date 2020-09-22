package chapter8;

import java.util.Scanner;

public class Exercise08_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3x3 matrix:");

		double[][] m = new double[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		double[][] newMatrix = sortColumns(m);
		
		System.out.println("The original matrix: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] );
			}
			System.out.println("");
		}
		
		System.out.println("The new matrix: ");
		for (int i = 0; i < newMatrix.length; i++) {
			for (int j = 0; j < newMatrix.length; j++) {
				System.out.print(newMatrix[i][j]);
			}
			System.out.println("");
		}

	}

	private static double[][] sortColumns(double[][] m) {
		double[][] result = new double[3][3];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				result[i][j] = m[i][j];
			}
		}
		
		for (int col = 0; col < result[0].length; col++) {
			for (int row = 0; row < result.length - 1; row++) {
				double min = result[row][col];
				int minIndex = row;
				
				for (int i = row + 1; i < result.length; i++) {
					if (result[i][col] < min) {
						min = result[i][col];
						minIndex = i;
					}
				}
				
				if (minIndex != row) {
					double temp = result[row][col];
					result[row][col] = result[minIndex][col];
					result[minIndex][col] = temp;
				}
			}
		}
		
		return result;
		
	}

}
