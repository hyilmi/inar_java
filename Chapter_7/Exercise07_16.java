package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter key (1-100): ");
		int key = input.nextInt();
		
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 101);
		}
		
		long linearSearch_start = System.currentTimeMillis();
		int result1 = linearSearch(array, key);
		long linearSearch_end = System.currentTimeMillis();
		long linearSearch_runtime = linearSearch_end - linearSearch_start;
		System.out.println("Linear search result: " + result1);
		System.out.println("Linear search runtime: " + linearSearch_runtime + " milliseconds");
		
		long binarySearch_start = System.currentTimeMillis();
		int result2 = binarySearch(array, key);
		long binarySearch_end = System.currentTimeMillis();
		long binarySearch_runtime = binarySearch_end - binarySearch_start;
		System.out.println("Binary search result: " + result2);
		System.out.println("Binary search runtime: " + binarySearch_runtime + " milliseconds");
		
				

	}

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] array, int key) {
		Arrays.sort(array);
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (high + low) / 2;

			if (key < array[mid]) {
				high = mid - 1;
			} else if (key == array[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
