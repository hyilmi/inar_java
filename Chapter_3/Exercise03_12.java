package chapter3;

import java.util.Scanner;

public class Exercise03_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three digit number: ");
		int number = input.nextInt();
		
		int digit1 = number % 10;
		int digit3 = number / 100;
		
		if (digit1 == digit3) {
			System.out.println(number + " is a palindrome.");
		}else {
			System.out.println(number + " is not a palindrome.");
		}

	}

}
