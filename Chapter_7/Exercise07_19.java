package chapter7;

import java.util.Scanner;

public class Exercise07_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list (the first number is the length of the list): ");
		int size = input.nextInt();
		int[] numbers = new int[size];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		boolean isSorted = isSorted(numbers);
		if(isSorted) {
			System.out.println("The list is sorted.");
		}else {
			System.out.println("The list is not sorted.");
		}

	}

	private static boolean isSorted(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			if(numbers[i] > numbers[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
