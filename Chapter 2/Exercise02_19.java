package chapter2;
import java.util.Scanner;

public class Exercise02_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1Squared = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
		double side1 = Math.pow(side1Squared, 0.5);
		
		double side2Squared = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2);
		double side2 = Math.pow(side2Squared, 0.5);
		
		double side3Squared = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);
		double side3 = Math.pow(side3Squared, 0.5);
		
		double s = (side1 + side2 + side3)/2;
		double areaSquared = s * (s - side1) * (s - side2) * (s - side3);
		double area = Math.pow(areaSquared, 0.5);
		
		System.out.println("The area of the triangle is " + area);

	}

}
