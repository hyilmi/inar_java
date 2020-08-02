package chapter3;

import java.util.Scanner;

public class Exercise03_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.println("Enter weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
	
		double pricePerPound1 = price1 / weight1;
		double pricePerPound2 = price2 / weight2;
		System.out.println(pricePerPound1);
		System.out.println(pricePerPound2);
		
		if (pricePerPound1 < pricePerPound2) {
			System.out.println("Package 1 has a better price.");
		}else if (pricePerPound2 < pricePerPound1) {
			System.out.println("Package 2 has a better price.");
		}else {
			System.out.println("Two packages have the same price.");
		}
	}

}
