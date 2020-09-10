package chapter7;

import java.util.Scanner;

public class Exercise07_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount of elements: ");
		int size = input.nextInt();
		
		int[] list = new int[size];
		
		System.out.print("Enter the values: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		
		if (isConsecutiveFours(list)) {
			System.out.println("The list has four consecutive values.");
		}else {
			System.out.println("The list does not have four consecutive values.");
		}
	}

	public static boolean isConsecutiveFours(int[] list) {
		int count;
		for (int i = 0; i < list.length - 1; i++) {
			count = 1;
			for (int j = i+1; j < list.length; j++) {
				if(list[i] != list[j]) {
					break;
				}else {
					count++;
				}
			}
			if(count == 4) {
				return true;
			}
		}
		return false;
	}

}
