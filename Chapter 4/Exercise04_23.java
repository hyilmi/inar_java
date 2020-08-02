package chapter4;

import java.util.Scanner;

public class Exercise04_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		int hoursOfWork = input.nextInt();
		
		System.out.print("Enter hourly pay rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		double grossPay = (int)(hoursOfWork * hourlyRate * 100) / 100.0;
		double federalDeduction = (int)(grossPay * federalTaxRate * 100) / 100.0;
		double stateDeduction = (int)(grossPay * stateTaxRate * 100) / 100.0;
		
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hoursOfWork);
		System.out.println("Pay rate: $" + hourlyRate);
		System.out.println("Gross pay: $" + (grossPay));
		System.out.println("Deductions:");
		System.out.println("\tFederal Witholding (" + (federalTaxRate*100) + "%): $" + (federalDeduction));
		System.out.println("\tState Withholding (" + (stateTaxRate*100) + "%): $" + (stateDeduction));
		System.out.println("\tTotal Deduction: $" + (federalDeduction + stateDeduction));
		System.out.println("Net Pay: $" + (grossPay - (federalDeduction + stateDeduction)));
	}

}
