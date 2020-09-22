package chapter8;

import java.util.Scanner;

public class Exercise08_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 3x3 matrix:");
		
		double[][] m = new double[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		if (isMarkovMatrix(m)) {
			System.out.println("It is a Markov matrix");
		}else {
			System.out.println("It is not a Markov matrix");
		}

	}

	private static boolean isMarkovMatrix(double[][] m) {
		for (int i = 0; i < m[0].length; i++) {
			double sum = 0;
			
			for (int j = 0; j < m.length; j++) {
				sum += m[j][i];
			}
			
			if (sum != 1) {
				return false;
			}
		}
		return true;
	}

}
