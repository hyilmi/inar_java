package chapter6;

import java.util.Scanner;

public class Exercise06_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		long number = input.nextLong();

		long sumDigits = sumDigits(number);
		System.out.println("The sum of the digits of " + number + " is " + sumDigits);

		input.close();
	}

	public static long sumDigits(long n) {
		long sumDigits = 0;
		long digit = 0;

		while (n != 0) {
			digit = n % 10;
			n = n / 10;
			sumDigits = sumDigits + digit;
		}

		return sumDigits;

	}

}
