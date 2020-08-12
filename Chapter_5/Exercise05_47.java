package chapter5;

import java.util.Scanner;

public class Exercise05_47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = input.nextLine();
		
		if(isbn.length() != 12) {
			System.out.println("Invalid input.");
			System.exit(-1);
		}
		
		int sum = 0;
		for (int i = 0; i < 12; i++) {
			if(i % 2 == 0) {
				sum += 3 * Integer.parseInt(isbn.charAt(i) + "");
			}else {
				sum += Integer.parseInt(isbn.charAt(i) + "");
			}
		}
		int isbn13 = 10 - sum % 10;
		
		if(isbn13 == 10) {
			isbn13 = 0;
		}
		System.out.println(isbn + isbn13);
		
		

	}

}
