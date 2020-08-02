package chapter3;

import java.util.Scanner;

public class Exercise03_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point with 2 coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double hypotenuse = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
		
		if (hypotenuse <= 10) {
			System.out.println("The point is in the circle.");
		}else {
			System.out.println("The point is not in the circle.");
		}

	}

}
