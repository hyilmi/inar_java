package chapter6;

import java.util.Scanner;

public class Exercise06_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String password = input.nextLine();

		checkPassword(password);

		input.close();

	}

	private static void checkPassword(String password) {
		int numberCount = 0;
		boolean validPassword = true;

		for (int i = 0; i < password.length(); i++) {

			// Check length of password
			if (password.length() < 8) {
				validPassword = false;
				break;
			}

			// Increase count if there is a number in the password
			if (Character.isDigit(password.charAt(i))) {
				numberCount++;
			}

			// Check if the current character is a letter or a digit
			if (Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i))) {
				continue;
			} else {
				validPassword = false;
				break;
			}

		}

		// Check the amount of digits in the password
		if (numberCount < 2) {
			validPassword = false;
		}

		if (validPassword) {
			System.out.println("Valid Password.");
		} else {
			System.out.println("Invalid Password.");
		}

	}

}
