package chapter5;

import java.util.Scanner;

public class Exercise05_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount of money: ");
		double balance = input.nextDouble();
		
		System.out.print("Enter annual interest rate: ");
		int annualInterestRate = input.nextInt();
		
		System.out.print("Enter months: ");
		int months = input.nextInt();
		
		double monthlyInterestRate = (annualInterestRate/100.0) / 12;
		double totalAmount = 0;
		
		for (int i = 0; i < months; i++) {
			totalAmount = (balance + totalAmount) * (1 + monthlyInterestRate);
		}
		System.out.printf("Total amount after %d months at %%%d interest rate: $%.2f", months, annualInterestRate, totalAmount);
		
		

	}

}
