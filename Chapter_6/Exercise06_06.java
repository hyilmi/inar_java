package chapter6;

import java.util.Scanner;

public class Exercise06_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of lines: ");
		int lines = input.nextInt();
		
		displayPattern(lines);
		
		input.close();
		
	}
	
	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			
			for (int j = n - i; j > 0; j--) {
				System.out.printf("%s", "  ");
			}
			
			for (int j = i; j > 0; j--) {
				System.out.printf("%2d", j);
			}
		
		System.out.println("");
		}
	}

}
