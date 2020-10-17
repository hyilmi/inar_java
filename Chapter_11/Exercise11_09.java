package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of matrix: ");
		int size = input.nextInt();
		
		int[][] matrix = new int[size][size];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		
		ArrayList<Integer> rows = new ArrayList<Integer>();
		ArrayList<Integer> columns = new ArrayList<Integer>();
		
		getMaxRows(rows, matrix);
		getMaxColumns(columns, matrix);
		
		System.out.println("The largest row index: " + rows.toString());
		System.out.println("The largest column index: " + columns.toString());
		
	}
	
	private static void getMaxRows(ArrayList<Integer> rows, int[][] matrix) {
		int maxCount = 0;
		for (int i = 0; i < matrix.length; i++) {
			int count = 0; 
			for (int j = 0; j < matrix.length; j++) {
				count += matrix[i][j];
			}
			
			if (count >= maxCount) {
				maxCount = count;
				rows.add(i);
			}
		}
		
	}

	private static void getMaxColumns(ArrayList<Integer> columns, int[][] matrix) {
		int maxCount = 0;
		for (int i = 0; i < matrix.length; i++) {
			int count = 0; 
			for (int j = 0; j < matrix.length; j++) {
				count += matrix[j][i];
			}
			
			if (count >= maxCount) {
				maxCount = count;
				columns.add(i);
			}
		}
	}

	

}
