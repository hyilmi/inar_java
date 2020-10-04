package chapter9;

public class Exercise09_09 {

	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6, 4);
		RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Polygon 1 Perimeter: " + p1.getPerimeter() + " | Area: " + p1.getArea());
		System.out.println("Polygon 2 Perimeter: " + p2.getPerimeter() + " | Area: " + p2.getArea());

	}

}

class RegularPolygon{
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	RegularPolygon(){
		
	}

	RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
	}
	
	RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
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

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getPerimeter() {
		return n * side;
	}
	
	public double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.toRadians(Math.PI) / n));
	}
	
	
	
	
	
}