package chapter12;

import java.util.Scanner;

public class Exercise12_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		boolean continueInput = true;
		do {

			try {

				System.out.print("Enter an index: ");
				int index = input.nextInt();
				System.out.println("Number at index " + index + ": " + arr[index]);

				continueInput = false;

			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Out of bounds.");
				input.nextLine();
			}

		} while (continueInput);

	}

}
