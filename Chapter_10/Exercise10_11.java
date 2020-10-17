package chapter10;

public class Exercise10_11 {

	public static void main(String[] args) {
		Circle2D circle1 = new Circle2D(2, 2, 5.5);
		Circle2D circle2 = new Circle2D(4, 5, 10.5);
		Circle2D circle3 = new Circle2D(3, 5, 2.3);
		
		System.out.println("Circle 1 area: " + circle1.getArea());
		System.out.println("Circle 1 perimeter: " + circle1.getPerimeter());
		System.out.println("Circle 1 contains (3, 3)?: " + circle1.contains(3, 3));
		System.out.println("Circle 1 contains circle 2?: " + circle1.contains(circle2));
		System.out.println("Circle 1 overlaps circle 3?: " + circle1.overlaps(circle3));

	}

}

class Circle2D{
	private double x;
	private double y;
	private double radius;
	
	public Circle2D(){
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public boolean contains(double x, double y) {
		double distanceFromCenter = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
		if (distanceFromCenter <= radius) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean contains(Circle2D circle) {
		double distanceFromCenter = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
		if (distanceFromCenter + circle.radius <= this.radius) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean overlaps(Circle2D circle) {
		double distanceFromCenter = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
		if (distanceFromCenter - circle.radius < this.radius && this.radius < distanceFromCenter + circle.radius) {
			return true;
		}else {
			return false;
		}
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}
	
	
	
}
