package chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3x3 matrix 1:");

		double[][] m1 = new double[3][3];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				m1[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("Enter 3x3 matrix 2:");

		double[][] m2 = new double[3][3];
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				m2[i][j] = input.nextDouble();
			}
		}
		
		if (equals(m1, m2)) {
			System.out.println("The two arrays are strictly identical");
		}else {
			System.out.println("The two arrays are not strictly identical");
		}

	}

	private static boolean equals(double[][] m1, double[][] m2) {
		for (int i = 0; i < m2.length; i++) {
			if (!Arrays.equals(m1[i], m2[i])) {
				return false;
			}
		}
		return true;
	}

}
