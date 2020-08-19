package chapter6;

import java.util.Scanner;

public class Exercise06_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		printMatrix(num);

		input.close();

	}

	private static void printMatrix(int num) {
		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num; j++) {
				int number = (int) (Math.random() * 2);
				System.out.print(number);

				if (j == num - 1) {
					System.out.println("");
				}

			}
		}
	}

}
