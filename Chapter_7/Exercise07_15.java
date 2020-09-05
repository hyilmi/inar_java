package chapter7;

import java.util.Scanner;

public class Exercise07_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 integers: ");

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		int[] distinctNumbers = eliminateDuplicates(numbers);
		System.out.println("The distinct numbers are ");
		for (int i = 0; i < distinctNumbers.length; i++) {
			System.out.print(distinctNumbers[i] + " ");
		}

	}

	public static int[] eliminateDuplicates(int[] numbers) {
		int count = 0;
		int[] array = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			boolean isDistinct = true;
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					isDistinct = false;
				}
			}
			if(isDistinct && numbers[i] != 0) {
				array[i] = numbers[i];
				count++;
			}
		}
		int[] result = new int[count];
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i];
		}
		return result;

	}

}
