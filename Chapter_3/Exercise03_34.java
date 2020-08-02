package chapter3;

import java.util.Scanner;

public class Exercise03_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for p0, p1, p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double p2Position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		System.out.println(p2Position);
		
		if (p2Position == 0) {
			System.out.println("(" + x2 + ", " + y2 + ") is on the same line.");
		}else {
			System.out.println("(" + x2 + ", " + y2 + ") is not on the same line.");
		}

	}

}
