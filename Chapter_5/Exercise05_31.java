package chapter5;

import java.util.Scanner;

public class Exercise05_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount: ");
		double amount = input.nextInt();
		
		System.out.print("Enter interest rate: ");
		double interestRate = input.nextDouble();
		
		System.out.print("Enter duration (months): ");
		int months = input.nextInt();
		
		System.out.println("Month\tCD Value");
		for (int i = 1; i <= months ; i++) {
			amount += amount * interestRate / 1200.0;
			
			System.out.print(i + "\t");
			System.out.printf("%.2f", amount);
			System.out.println("");
		}

	}

}
