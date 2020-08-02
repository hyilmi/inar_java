package chapter3;

import java.util.Scanner;

public class Exercise03_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the sides of a triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		boolean validTriangle = a < (b+c) && b < (a+c) && c < (a+b);
		
		if(validTriangle) {
			System.out.println("The triangle is valid.");
			System.out.println("The perimeter of the triangle is " + (a + b + c));
		}else {
			System.out.println("The triangle is invalid.");
			
		}
	}
	

}
