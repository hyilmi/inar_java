package chapter4;

import java.util.Scanner;

public class Exercise04_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of sides: ");
		int n = input.nextInt();
		
		System.out.println("Enter the length of the side: ");
		double s = input.nextDouble();
		
		double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
		
		System.out.println("The area of the polygon is " + (int)(area * 100) / 100.0);
		
	}

}
