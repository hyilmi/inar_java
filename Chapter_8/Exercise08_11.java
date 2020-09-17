package chapter8;

import java.util.Scanner;

public class Exercise08_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 511: ");
		int decimal = input.nextInt();
		
		int[] array = toBinary(decimal);
		
		char[][] result = headsOrTails(array);
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}

	}
	
	private static char[][] headsOrTails(int[] array) {
		char[] ht = new char[9];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				ht[i] = 'H';
			}else {
				ht[i] = 'T';
			}
		}
		
		char[][] result = new char[3][3];
		
		for (int i = 0; i < ht.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i/3][j] = ht[i];
			}
		}
		
		return result;
		
	}

	public static int[] toBinary(int decimal) {
		int[] result = new int[9];
		int index = 8;
		
		while(decimal > 0) {
			result[index] = decimal % 2;
			decimal /= 2;
			index--;
		}
		
		return result;
	}

}
