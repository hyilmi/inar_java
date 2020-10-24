package chapter13;

public class Rectangle extends ComparableGeometricObject {
	double width = 1;
	double height = 1;

	Rectangle() {

	}

	Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return width * 2 + height * 2;
	}

}
