package chapter6;

import java.util.Scanner;

public class Exercise06_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		boolean isValid = isValid(side1, side2, side3);

		if (isValid) {
			double area = area(side1, side2, side3);
			System.out.println("The area of the triangle is " + area);
		}else {
			System.out.println("Invalid triangle.");
		}
		
		input.close();

	}

	private static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
	}

	private static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) 
	        return false; 
	    else
	        return true; 
	}
	

}
