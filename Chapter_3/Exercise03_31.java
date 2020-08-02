package chapter3;

import java.util.Scanner;

public class Exercise03_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from USD to RMB: ");
		double exchangeRate = input.nextDouble();
		
		System.out.println("Enter 0 to convert USD to RMB");
		System.out.print("Enter 1 to convert RMB to USD:");
		int choice = input.nextInt();
		
		if (choice == 0) {
			System.out.println("Enter USD amount: ");
			double amount = input.nextDouble();
			double finalAmount = amount * exchangeRate;
			System.out.println("$" + amount + " is " + finalAmount + " yuan.");
		}else if (choice == 1) {
			System.out.println("Enter RMB amount: ");
			double amount = input.nextDouble();
			double finalAmount = amount / exchangeRate;
			System.out.println(amount + " yuan is $" + finalAmount);
		}else {
			System.out.println("Incorrect input.");
		}

	}

}
