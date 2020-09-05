package chapter7;

import java.util.Scanner;

public class Exercise07_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 integers: ");
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		boolean isNotSorted = false;
		do {

			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					isNotSorted = true;
					break;
				}else {
					isNotSorted = false;
				}
			}

			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}
			}
		} while (isNotSorted);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}
}
