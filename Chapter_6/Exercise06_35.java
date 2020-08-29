package chapter6;

import java.util.Scanner;

public class Exercise06_35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double length = input.nextDouble();
		
		System.out.println(area(5, length));

	}
	private static double area(int sides, double length) {
		return (sides * length * length) / (4 * Math.tan(Math.PI / sides));
	}

}
