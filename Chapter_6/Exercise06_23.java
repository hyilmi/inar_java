package chapter6;

import java.util.Scanner;

public class Exercise06_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.println("Enter a character: ");
		char c = input.nextLine().charAt(0);
		
		int count = count(s, c);
		System.out.printf("There are %d %c's in \"%s\"", count, c, s);
		
		input.close();
		
	}

	private static int count(String s, char c) {
		int letterCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				letterCount++;
			}
		}
		
		return letterCount;
	}

}
