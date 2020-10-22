package chapter13;

import java.util.Scanner;

import chapter12.IllegalTriangleException;

public class Exercise13_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the sides of a triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();

		try {
			Triangle t1 = new Triangle(s1, s2, s3);

			System.out.println("Filled? ");
			t1.setFilled(input.nextBoolean());

			input.nextLine();

			System.out.println("Color? ");
			t1.setColor(input.nextLine());

			System.out.println("Area: " + t1.getArea());
			System.out.println("Perimeter: " + t1.getPerimeter());
			System.out.println("Filled: " + t1.isFilled());
			System.out.println("Color: " + t1.getColor());

		} catch (IllegalTriangleException e) {
			e.printStackTrace();
		}

	}

}

class Triangle extends GeometricObject {

	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	Triangle() {

	}

	Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			throw new IllegalTriangleException("Invalid sides");
		} else {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}

	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

//	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}
