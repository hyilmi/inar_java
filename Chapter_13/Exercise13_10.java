package chapter13;

public class Exercise13_10 {

	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2(3, 5);
		Rectangle2 r2 = new Rectangle2(4, 4);
		
		System.out.println(Rectangle2.equals(r1, r2));

	}

}

class Rectangle2 extends GeometricObject implements Comparable<Rectangle2>{
	double width = 1;
	double height = 1;

	Rectangle2() {

	}

	Rectangle2(double w, double h) {
		width = w;
		height = h;
	}
	
	public static boolean equals(Rectangle2 r1, Rectangle2 r2) {
		return r1.getArea() == r2.getArea();
	}

	@Override
	public int compareTo(Rectangle2 o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		}else if(this.getArea() < o.getArea()) {
			return -1;
		}else {
			return 0;
		}
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return width * 2 + height * 2;
	}
	
}
