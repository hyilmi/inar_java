package chapter8;

import java.util.Scanner;

public class Exercise08_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] m = new double[3][2];

		System.out.println("Enter five points: ");

		for (int x = 0; x < m.length; x++) {
			for (int y = 0; y < m[x].length; y++) {
				m[x][y] = input.nextDouble();
			}
		}

		double position = (m[1][0] - m[0][0]) * (m[2][1] - m[0][1]) - (m[2][0] - m[0][0]) * (m[1][1] - m[0][1]);
		
		if (position == 0) {
			System.out.println("The five points are on the same line.");
		}else {
			System.out.println("The five points are not on the same line.");
		}
	}

}
