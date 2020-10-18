package chapter10;

public class Exercise10_13 {

	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4);
		MyRectangle2D r2 = new MyRectangle2D(4, 5, 10.5, 3.2);
		MyRectangle2D r3 = new MyRectangle2D(3, 5, 2.3, 5.4);
		
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());
		System.out.println("Contains (3, 3): " + r1.contains(3, 3));
		System.out.println("Contains r2: " + r1.contains(r2));
		System.out.println("Contains r3: " + r1.contains(r3));
	}

}

class MyRectangle2D{
	private double x;
	private double y;
	private double width;
	private double height;
	
	public MyRectangle2D() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}
	
	public MyRectangle2D(double  x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return 2*width + 2*height;
	}
	
	public boolean contains(double x, double y) {
		boolean xInRange = Math.abs(this.x - (width/2)) <= x && x <= Math.abs(this.x + (width/2));
		boolean yInRange = Math.abs(this.y - (height/2)) <= y && y <= Math.abs(this.y + (height/2));
		
		return xInRange && yInRange;
	}
	
	public boolean contains(MyRectangle2D r) {
		boolean b1 = distance(this.x, r.getX()) + r.getWidth()/2 <= width/2;
		boolean b2 = distance(this.y, r.getY()) + r.getHeight()/2 <= height/2;
		boolean b3 = width/2 + r.getWidth()/2 <= width;
		boolean b4 = height/2 + r.getHeight()/2 <= height;
		
		return b1 && b2 && b3 && b4;
		
	}
	
	public boolean overlaps(MyRectangle2D r) {
		//TODO no idea lol
		return true;
	}
	
	public double distance(double x1, double x2) {
		return Math.sqrt(Math.pow(x1-x2, 2));
	}
	
	
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
