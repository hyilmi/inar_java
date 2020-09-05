package chapter7;

import java.util.Scanner;

public class Exercise07_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		
		int[] numbers = new int[10];
		int[] array = new int[10];
		int distinctCount = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			boolean isDistinct = true;
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					isDistinct = false;
				}
			}
			if(isDistinct) {
				array[i] = numbers[i];
				distinctCount++;
			}
		}
		int[] distinctNumbers = new int[distinctCount];
		for (int i = 0; i < distinctNumbers.length; i++) {
			if(array[i] != 0) {
				distinctNumbers[i] = array[i];
			}
		}
		
		System.out.println("The number of distinct numbers is " + distinctCount);
		for (int j = 0; j < distinctNumbers.length; j++) {
			System.out.print(distinctNumbers[j] + " ");
		}
	}

}
