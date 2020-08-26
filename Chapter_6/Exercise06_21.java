package chapter6;

import java.util.Scanner;

public class Exercise06_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();
		String sUppercase = s.toUpperCase();
		String newNumber = "";

		for (int i = 0; i < sUppercase.length(); i++) {
			if (Character.isLetter(sUppercase.charAt(i))) {
				int number = getNumber(sUppercase.charAt(i));
				newNumber = newNumber + number;
			}else {
				newNumber = newNumber + sUppercase.charAt(i);
			}
		}
		System.out.println(newNumber);

	}

	public static int getNumber(char uppercaseLetter) {
		if (65 <= uppercaseLetter && uppercaseLetter <= 90) {
			if ('W' <= uppercaseLetter) {
				return 9;
			} else if ('T' <= uppercaseLetter) {
				return 8;
			} else if ('P' <= uppercaseLetter) {
				return 7;
			} else if ('M' <= uppercaseLetter) {
				return 6;
			} else if ('J' <= uppercaseLetter) {
				return 5;
			} else if ('G' <= uppercaseLetter) {
				return 4;
			} else if ('D' <= uppercaseLetter) {
				return 3;
			} else if ('A' <= uppercaseLetter) {
				return 2;
			}
		}
		return -1; //idk idc
	}

}
