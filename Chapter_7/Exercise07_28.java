package chapter7;

import java.util.Scanner;

public class Exercise07_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 integers: ");

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				System.out.printf("(%d, %d) ", array[i], array[j]);
			}
			System.out.println("");
		}

	}

}
