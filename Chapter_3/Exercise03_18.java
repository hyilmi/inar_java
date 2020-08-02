package chapter3;

import java.util.Scanner;

public class Exercise03_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight of your cargo: ");
		double cargoWeight = input.nextDouble();
		
		if (0 < cargoWeight && cargoWeight <= 1) {
			System.out.println("Your total amount is $3.5");
		}else if (1 < cargoWeight && cargoWeight <= 3) {
			System.out.println("Your total amount is $5.5");
		}else if (3 < cargoWeight && cargoWeight <= 10) {
			System.out.println("Your total amount is $8.5");
		}else if (10 < cargoWeight && cargoWeight <= 20) {
			System.out.println("Your total amount is $10.5");
		}else if(50 < cargoWeight) {
			System.out.println("Your package cannot be shipped.");
		}

	}

}
