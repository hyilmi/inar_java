package chapter5;

import java.util.Scanner;

public class Exercise05_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of an ISBN-10 as a string: ");
		String isbn = input.nextLine();
		int sum = 0;
		
		for (int i = 1; i <= 9; i++) {
			sum += Integer.parseInt(isbn.charAt(i-1) + "") * i;
		}
		int digit10 = sum % 11;
		
		if(digit10 > 9){
			System.out.println("ISBN: " + isbn + "X");
		}else {
			System.out.println("ISBN: " + isbn + digit10);
		}

	}

}
