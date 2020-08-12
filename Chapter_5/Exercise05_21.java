package chapter5;

import java.util.Scanner;

public class Exercise05_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		
		System.out.println("Interest Rate     Monthly Payment     Total Payment");
		
		for(double interest = 5; interest <= 8; interest += 0.125) {
			System.out.printf("%%%-17.3f", interest);
			
			double monthlyInterestRate = interest / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1- 1 / Math.pow(1 + monthlyInterestRate, years * 12));
			
			System.out.printf("$%-19.2f", monthlyPayment);
			System.out.printf("$%-8.2f\n",(monthlyPayment * 12) * years);
		}
		

	}

}
