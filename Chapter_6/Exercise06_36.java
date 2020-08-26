package chapter6;

import java.util.Scanner;

public class Exercise06_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		int sides = input.nextInt();
		
		System.out.print("Enter the side: ");
		double length = input.nextDouble();
		
		double area = area(sides, length);
		
		System.out.printf("The area of the polygon is %.2f", area);
		
		input.close();
	
	}

	private static double area(int sides, double length) {
		return (sides * length * length) / (4 * Math.tan(Math.PI / sides));
	}

}
