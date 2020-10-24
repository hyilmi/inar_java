package chapter13;

public class Exercise13_09 {

	public static void main(String[] args) {
		Circle2 c1 = new Circle2(3);
		Circle2 c2 = new Circle2(5);
		
		System.out.println(Circle2.equals(c1, c2));

	}

}

class Circle2 extends GeometricObject implements Comparable<Circle> {

	private double radius = 1;

	Circle2() {

	}

	Circle2(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public String toString() {
		return "Radius: " + this.radius + " Perimeter: " + getPerimeter() + " Area: " + getArea();
	}

	@Override
	public int compareTo(Circle o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

	public static boolean equals(Circle2 c1, Circle2 c2) {
		return c1.getRadius() == c2.getRadius();
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

}
