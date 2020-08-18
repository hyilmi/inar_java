package chapter6;

import java.util.Scanner;

public class Exercise06_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 3 numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		displaySortedNumbers(num1, num2, num3);

		input.close();

	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}

		System.out.printf("%.0f %.0f %.0f", num1, num2, num3);

	}

}
