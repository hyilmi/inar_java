package chapter4;

import java.util.Scanner;

public class Exercise04_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length form the center of the pentagon"
				+ "to a vertex: ");
		double r = input.nextDouble();
		
		double s = 2 * r * Math.sin(Math.PI / 5);
		
		double areaPentagon = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
		
		System.out.println("The area of the pentagon is " + (int)(areaPentagon*100)/100.0); 

	}

}
