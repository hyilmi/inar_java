package chapter5;

import java.util.Scanner;

public class Exercise05_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();

		for (int i = 1; i <= lines; i++) {

			for (int spaces = lines - i; spaces >= 1; spaces--) {
				System.out.print("  ");
			}

			for (int down = i; down > 1; down--) {
				System.out.print(down + " ");
			}

			for (int up = 1; up <= i; up++) {
				System.out.print(up + " ");

			}
			System.out.println("");

		}

	}

}
