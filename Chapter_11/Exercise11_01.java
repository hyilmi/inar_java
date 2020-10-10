package chapter11;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Exercise11_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		System.out.println("Enter color: ");
		String color = input.next();

		System.out.println("Enter true or false if filled: ");
		boolean filled = input.nextBoolean();

		Triangle t1 = new Triangle(side1, side2, side3);

		t1.setColor(color);
		t1.setFilled(filled);

		System.out.println(t1.toString());
		System.out.println("Area: " + t1.getArea());
		System.out.println("Perimeter: " + t1.getPerimeter());
		System.out.println("Color: " + t1.getColor());
		System.out.println("Filled?: " + t1.isFilled());

	}

}

class Triangle extends GeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	Triangle() {

	}

	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
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

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}