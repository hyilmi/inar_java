package chapter2;

import java.util.Scanner;

public class Exercise02_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double FAIZ_ORANI = 0.00417;
		
		System.out.println("Enter monthly saving amount: ");
		double savingAmount = input.nextDouble();
		
		double total = 100 * (1 + FAIZ_ORANI);
		
		total = (100 + total) * (1 + FAIZ_ORANI);
		total = (100 + total) * (1 + FAIZ_ORANI);
		total = (100 + total) * (1 + FAIZ_ORANI);
		total = (100 + total) * (1 + FAIZ_ORANI);
		total = (100 + total) * (1 + FAIZ_ORANI);
		
		System.out.println("After the sixth month, the balance is $" + total);
	}
	

}
