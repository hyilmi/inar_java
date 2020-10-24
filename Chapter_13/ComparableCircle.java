package chapter13;

public class ComparableCircle implements Comparable<ComparableCircle> {
	private double radius = 1;

	ComparableCircle() {

	}

	ComparableCircle(double radius) {
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

	public int compareTo(ComparableCircle x) {
		if (this.getArea() > x.getArea()) {
			return 1;
		} else if (this.getArea() < x.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

	public ComparableCircle max(ComparableCircle x) {
		if (this.compareTo(x) == 1) {
			return this;
		} else {
			return x;
		}

	}
}
