package chapter5;

import java.util.Scanner;

public class Exercise05_48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		String oddIndexLetters = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				oddIndexLetters += s.charAt(i);
			}
		}
		System.out.println(oddIndexLetters);

	}

}
