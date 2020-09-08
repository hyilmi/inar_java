package chapter7;

import java.util.Scanner;

public class Exercise07_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		str = sort(str);
		System.out.println(str);
	}

	private static String sort(String str) {
		String result = "";
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length - 1; i++) {
			char min = array[i];
			int minIndex = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			
			char temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}

}
