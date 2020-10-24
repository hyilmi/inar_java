package chapter13;

public class Exercise13_07 {

	public static void main(String[] args) {
		GeometricObject[] list = {new Square(12), new Square(13), 
				new Square(8.32), new Square(44), new Square()};
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("Square " + i + ":");
			System.out.println(list[i] + "");
			((Square)list[i]).howToColor();
			
		}

	}

}

class Square extends GeometricObject implements Colorable{
	private double side;
	
	Square(){
		this.side = 1;
	}
	
	Square(double side){
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public String toString() {
		return "Side length: " + getSide() + " Perimeter: " + getPerimeter() + " Area: " + getArea();
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	@Override
	public double getPerimeter() {
		return side*4;
	}

	@Override
	public double getArea() {
		return side*side;
	}
	
}
