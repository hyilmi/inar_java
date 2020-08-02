package chapter3;

import java.util.Scanner;

public class Exercise03_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with 2 coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double longestDistanceFromOrigin = Math.pow(Math.pow(2.5, 2) + Math.pow(5, 2), 0.5);
		double pointsDistanceFromOrigin = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
		
		if (pointsDistanceFromOrigin <= longestDistanceFromOrigin) {
			System.out.println("The point is in the rectangle.");
		}else {
			System.out.println("The point is not in the rectangle.");
		}

	}

}
