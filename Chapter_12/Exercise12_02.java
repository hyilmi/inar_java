package chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two integers: ");
		int x = 0;
		int y = 0;
		
		boolean continueInput = true;
		do {
			
			try {

				System.out.print("Integer 1: ");
				x = input.nextInt();
				System.out.print("Integer 2: ");
				y = input.nextInt();
				
				continueInput = false;

			} catch (InputMismatchException ex) {
				System.out.println("Invalid input. Try again.");
				input.nextLine();
			}
			
		} while (continueInput);
		
		System.out.println("The sum of the two integers is " + (x+y));

	}

}
