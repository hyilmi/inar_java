package chapter8;

import java.util.Scanner;

public class Exercise08_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter matrix 1 (3x3): ");
		double[][] matrix1 = new double[3][3];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}

		System.out.println("Enter matrix 2 (3x3): ");
		double[][] matrix2 = new double[3][3];
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}

		double[][] result = multiplyMatrix(matrix1, matrix2);
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				System.out.printf("%4.1f", matrix1[i][j]);
			}
			
			if (i == 1) {
				System.out.print(" * ");
			}else {
			System.out.print("   ");
			}

			for (int j = 0; j < matrix2.length; j++) {
				System.out.printf("%4.1f", matrix2[i][j]);
			}

			if (i == 1) {
				System.out.print(" = ");
			}else {
			System.out.print("   ");
			}

			for (int j = 0; j < result.length; j++) {
				System.out.printf("%4.1f ", result[i][j]);
			}
			
			System.out.println("");
		}
	}

	private static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
		double result[][] = new double[3][3];
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j] + matrix1[i][2] * matrix2[2][j];
			}
		}
		
		
		return result;
	}

}
