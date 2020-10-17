package chapter12;

import java.util.Scanner;

public class Exercise12_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {

			System.out.println("Enter three sides of a triangle: ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();

			try {

				Triangle t1 = new Triangle(side1, side2, side3);
				continueInput = false;

				System.out.println("Enter color: ");
				String color = input.next();

				System.out.println("Enter true or false if filled: ");
				boolean filled = input.nextBoolean();

				t1.setColor(color);
				t1.setFilled(filled);

				System.out.println(t1.toString());
				System.out.println("Area: " + t1.getArea());
				System.out.println("Perimeter: " + t1.getPerimeter());
				System.out.println("Color: " + t1.getColor());
				System.out.println("Filled?: " + t1.isFilled());

			} catch (IllegalTriangleException e) {
				System.out.println(e.getMessage());
			}

		} while (continueInput);

	}

}


