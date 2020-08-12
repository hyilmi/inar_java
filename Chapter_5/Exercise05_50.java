package chapter5;

import java.util.Scanner;

public class Exercise05_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		int upperCaseLetters = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				upperCaseLetters++;
			}
			
		}
		System.out.println("The number of uppercase letters is " + upperCaseLetters);

	}

}
