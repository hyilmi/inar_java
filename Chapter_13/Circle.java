package chapter13;

public class Circle extends ComparableGeometricObject {
	private double radius = 1;

	Circle() {

	}

	Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public String toString() {
		return "Radius: " + this.radius + " Perimeter: " + getPerimeter() + " Area: " + getArea();
	}
}
