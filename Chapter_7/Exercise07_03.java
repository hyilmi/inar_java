package chapter7;

import java.util.Scanner;

public class Exercise07_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter digits between 1-100 (0 to end): ");
		int array[] = new int[100];
		int a = -1;

		do {
			a = input.nextInt();

			if (a != 0) {
				if (a < 0 || a > 100) {
					System.err.println("Invalid input.");
				} else {
					array[a - 1]++;
				}
			}
		} while (a != 0);

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				System.out.println(i + " occurs 1 time");
			} else if (array[i] != 0) {
				System.out.println(i + " occurs " + array[i] + " times");
			}
		}

	}

}
