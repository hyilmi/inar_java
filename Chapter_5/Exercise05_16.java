package chapter5;

import java.util.Scanner;

public class Exercise05_16 {

	public static void main(String[] args) {
		//TODO rework
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		int temp = number;
		String divisors = "";
		
		while (temp % 2 == 0) {
			temp /= 2;
			divisors = divisors + " 2";
		}
		while (temp % 3 == 0) {
			temp /= 3;
			divisors = divisors + " 3";
		}
		while (temp % 5 == 0) {
			temp /= 5;
			divisors = divisors + " 5";
		}
		while (temp % 7 == 0) {
			temp /= 7;
			divisors = divisors + " 7";
		}
		
		System.out.println("The smallest divisors of " + number + " are" + divisors);
		
	}

}
