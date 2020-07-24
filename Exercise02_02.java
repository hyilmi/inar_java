package chapter2;
import java.util.Scanner;

public class Exercise02_02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
		
		System.out.println("Enter radius of cylinder base: ");
		double radius = input.nextDouble();
		
		System.out.println("Enter height of cylinder: ");
		double height = input.nextDouble();
		
		double cylinderArea = radius * radius * PI;
		double cylinderVolume = cylinderArea * height;
		
		System.out.println("Cylinder area: " + cylinderArea);
		System.out.println("Cylinder volume: " + cylinderVolume);

	}

}
