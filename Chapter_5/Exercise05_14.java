package chapter5;

import java.util.Scanner;

public class Exercise05_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		int number1 = input.nextInt();
		System.out.print("Enter number 2: ");
		int number2 = input.nextInt();

		int min = Math.min(number1, number2);
		int gcd = min;

		for (int i = min; i > 0; i--) {
			if (number1 % i == 0 && number2 % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.println("The greatest common divisor of " + number1 + " and " + number2 + " is " + gcd);

	}

}
