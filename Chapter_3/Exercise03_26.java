package chapter3;

import java.util.Scanner;

public class Exercise03_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		boolean divisibleBy5and6 = number % 5 == 0 && number % 6 == 0;
		boolean divisibleBy5or6 = number % 5 == 0 || number % 6 == 0;
		boolean divisibleBy5or6_notBoth = number % 5 == 0 ^ number % 6 == 0;
		
		System.out.println("Is " + number + " divisible by 5 and 6? " + divisibleBy5and6);
		System.out.println("Is " + number + " divisible by 5 or 6? " + divisibleBy5or6);
		System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + divisibleBy5or6_notBoth);

	}

}
