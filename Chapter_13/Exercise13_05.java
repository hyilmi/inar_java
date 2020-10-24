package chapter13;

public class Exercise13_05 {


	public static void main(String[] args) {
		ComparableGeometricObject c1 = new Circle(10);
		ComparableGeometricObject c2 = new Circle(20);
		ComparableGeometricObject maxC = c1.max(c2);
		
		System.out.println("The bigger circle is " + maxC);
		
		ComparableGeometricObject r1 = new Rectangle(4, 4);
		ComparableGeometricObject r2 = new Rectangle(3, 5);
		ComparableGeometricObject maxR = r1.max(r2);
		
		System.out.println("The bigger rectangle is " + maxR);
	}

}

abstract class ComparableGeometricObject implements Comparable<ComparableGeometricObject>{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected ComparableGeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected ComparableGeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	@Override
	public int compareTo(ComparableGeometricObject x) {
		if (this.getArea() > x.getArea()) {
			return 1;
		}else if(this.getArea() < x.getArea()) {
			return -1;
		}else {
			return 0;
		}
	}
	public ComparableGeometricObject max(ComparableGeometricObject x) {
		if (this.compareTo(x) == 1) {
			return this;
		}else {
			return x;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}

