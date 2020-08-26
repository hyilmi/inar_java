package chapter6;

import java.util.Scanner;

public class Exercise06_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double interestRate = input.nextDouble();
		double monthlyInterestRate = interestRate / 1200;
		
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		
		double result = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
		
		System.out.printf("Your future investment value is $%.2f", result);

	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, double years) {
		return investmentAmount * Math.pow((1 + monthlyInterestRate), years*12);
	}
	

}
