package chapter3;

import java.util.Scanner;

public class Exercise03_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter circle1's center x-y coordinates and radius: ");
		double c1x = input.nextDouble();
		double c1y = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.println("Enter circle2's center x-y coordinates and radius: ");
		double c2x = input.nextDouble();
		double c2y = input.nextDouble();
		double r2 = input.nextDouble();
		
		double centerDifference = Math.pow(Math.pow(c1x-c2x, 2) + Math.pow(c1y-c2y, 2), 0.5);
		double radiusDifference = Math.pow(Math.pow(r1-r2, 2), 0.5);
		
		if (centerDifference >= radiusDifference) {
			System.out.println("Circle2 is inside circle1.");
		}else if (centerDifference <= r1+r2) {
			System.out.println("Circle2 overlaps circle1");
		}else {
			System.out.println("Circle2 does not overlap circle 1");
		}
		
	}

}
