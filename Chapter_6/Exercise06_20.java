package chapter6;

import java.util.Scanner;

public class Exercise06_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println("There are " + countLetters(s) + " letters in \"" + s + "\"");
	}

	private static int countLetters(String s) {
		int letterCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				letterCount++;
			}
			
		}
		return letterCount;
		
	}

}
