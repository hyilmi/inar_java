package chapter13;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side;

	public Octagon() {

	}

	public Octagon(double side) {
		this.side = side;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public double getArea() {
		return (2 + 4 * Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		return side * 8;
	}

}
