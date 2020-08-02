package chapter4;

import java.util.Scanner;

public class Exercise04_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char ch = Character.toUpperCase(input.nextLine().charAt(0));

		if ('W' <= ch) {
			System.out.print("The corresponding number is 9");
		} else if ('T' <= ch) {
			System.out.print("The corresponding number is 8");
		} else if ('P' <= ch) {
			System.out.print("The corresponding number is 7");
		} else if ('M' <= ch) {
			System.out.print("The corresponding number is 6");
		} else if ('J' <= ch) {
			System.out.print("The corresponding number is 5");
		} else if ('G' <= ch) {
			System.out.print("The corresponding number is 4");
		} else if ('D' <= ch) {
			System.out.print("The corresponding number is 3");
		} else if ('A' <= ch) {
			System.out.print("The corresponding number is 2");
		} else {
			System.out.println("Invalid input.");
		}

	}

}
