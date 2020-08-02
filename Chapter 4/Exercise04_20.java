package chapter4;

import java.util.Scanner;

public class Exercise04_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		System.out.println("String length: " + str.length() + "\n" + 
		"First letter: " + str.charAt(0));
	}

}
