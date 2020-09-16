package chapter8;

import java.util.Scanner;

public class Exercise08_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		double[][] matrix = new double[rows][columns];
		
		System.out.println("Enter the array: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		int[] indices = locateLargest(matrix);
		
		System.out.printf("The location of the largest element is at (%d, %d)", indices[0], indices[1]);
		
		input.close();
		
	}

	public static int[] locateLargest(double[][] matrix) {
		int[] result = new int[2];
		
		double maxNum = 0;
		int maxNumRow= 0;
		int maxNumColumn = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > maxNum) {
					maxNum = matrix[i][j];
					maxNumRow = i;
					maxNumColumn = j;
				}
			}
		}
		
		result[0] = maxNumRow;
		result[1] = maxNumColumn;
		
		return result;
	}
	
	

}
