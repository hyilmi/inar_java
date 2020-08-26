package chapter6;

import java.util.Scanner;

public class Exercise06_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter card number: ");
		long number = input.nextLong();
		String numberString = number + "";

		int sumEven = sumEven(numberString);

		int sumOdd = sumOdd(numberString);

		int sum = sumOdd + sumEven;

		boolean isValid = isValid(sum);

		if (isValid) {
			System.out.println("Valid card.");
		} else {
			System.out.println("Invalid card.");
		}
	}

	private static boolean isValid(int sum) {
		boolean isValid;
		if (sum % 10 == 0) {
			isValid = true;
		} else {
			isValid = false;
		}
		return isValid;
	}

	private static int sumOdd(String numberString) {
		int sumOdd = 0;
		for (int i = numberString.length() - 1; i >= 0; i -= 2) {
			int digit = Integer.parseInt(numberString.charAt(i) + "");
			sumOdd += digit;
		}
		return sumOdd;
	}

	private static int sumEven(String numberString) {
		int sumEven = 0;
		int timesTwo = 0;
		for (int i = numberString.length() - 2; i >= 0; i -= 2) {
			int digit = Integer.parseInt(numberString.charAt(i) + "");
			timesTwo = digit * 2;
			if (timesTwo >= 10) {
				timesTwo = timesTwo / 10 + timesTwo % 10;
			}
			sumEven += timesTwo;
		}
		return sumEven;
	}

}
