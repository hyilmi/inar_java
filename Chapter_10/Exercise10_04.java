package chapter10;

public class Exercise10_04 {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		
		System.out.println("The distance between p1 and p2: " + p1.distance(p2));

	}

}

class MyPoint{
	private double x;
	private double y;
	
	MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
}
