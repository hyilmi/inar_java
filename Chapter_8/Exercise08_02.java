package chapter8;

import java.util.Scanner;

public class Exercise08_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4x4 matrix row by row: ");
		
		double[][] matrix = new double[4][4];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		
		System.out.println("Sum of the elements in the major diagonal is " + sum);

	}

}
