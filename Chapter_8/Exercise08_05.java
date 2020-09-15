package chapter8;

import java.util.Scanner;

public class Exercise08_05 {

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

		double[][] result = addMatrix(matrix1, matrix2);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				System.out.printf("%4.1f", matrix1[i][j]);
			}
			
			if (i == 1) {
				System.out.print(" + ");
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
				System.out.printf("%4.1f", result[i][j]);
			}
			
			System.out.println("");

		}
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] result = new double[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}

		return result;
	}

}
