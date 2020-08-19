package chapter6;

import java.util.Scanner;

public class Exercise06_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char c1 = '1';
		char c2 = 'Z';
		
		printChars(c1, c2, 10);
		
		input.close();
	}

	public static void printChars(char c1, char c2, int i) {
		int count = 0;
		
		for (int j = (int)(c1); j <= (int)(c2); j++) {
			char c = (char)(j);
			System.out.print(c + " ");
			count++;
			
			if (count % i == 0) {
				System.out.println("");
			}
		}
		
		
	}
	

}
