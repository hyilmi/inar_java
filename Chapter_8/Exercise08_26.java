package chapter8;

import java.util.Scanner;

public class Exercise08_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3x3 matrix:");

		double[][] m = new double[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			m[i] = sort(m[i]);
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}

	}

	private static double[] sort(double[] m) {
		for (int i = 0; i < m.length - 1; i++) {
			double min = m[i];
			int minIndex = i;
			for (int j = i + 1; j < m.length; j++) {
				if (m[j] < min) {
					min = m[j];
					minIndex = j;
				}
			}
			
			if (minIndex != i) {
				double temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;
			}
		}
		return m;
	}

}
