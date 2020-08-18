package chapter6;

import java.util.Scanner;

public class Exercise06_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer to check if it's a palindrome: ");
		int number = input.nextInt();

		int numberReversed = reverse(number);

		boolean isPalindrome = isPalindrome(numberReversed);

		if (isPalindrome) {
			System.out.println(number + " is a palindrome number.");
		} else {
			System.out.println(number + " is not a palindrome number.");
		}

		input.close();

	}

	public static int reverse(int number) {
		String s = number + "";
		String sReversed = "";

		for (int i = 0; i < s.length(); i++) {
			sReversed = s.charAt(i) + sReversed;
		}

		int numberReversed = Integer.parseInt(sReversed);
		return numberReversed;
	}

	public static boolean isPalindrome(int number) {

		if (number == reverse(number)) {
			return true;
		} else {
			return false;
		}
	}

}
