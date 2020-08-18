package chapter6;

import java.util.Scanner;

public class Exercise06_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer to reverse it: ");
		int number = input.nextInt();

		System.out.print(number + " reversed is ");
		reverse(number);

		input.close();

	}

	public static void reverse(int number) {
		String s = number + "";
		String sReversed = "";

		for (int i = 0; i < s.length(); i++) {
			sReversed = s.charAt(i) + sReversed;
		}

		int numberReversed = Integer.parseInt(sReversed);
		System.out.print(numberReversed);
	}

}
