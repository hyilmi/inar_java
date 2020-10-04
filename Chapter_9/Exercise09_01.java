package chapter9;

public class Exercise09_01 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("\t\tWIDTH   HEIGHT   AREA   PERIMETER");
		System.out.printf("Rectangle 1:    %5.2f   %5.2f   %5.2f   %5.2f\n", r1.width, r1.height, r1.getArea(), r1.getPerimeter());
		System.out.printf("Rectangle 2:    %5.2f   %5.2f   %5.2f   %5.2f", r2.width, r2.height, r2.getArea(), r2.getPerimeter());

	}

}

class Rectangle{
	double width = 1;
	double height = 1;
	
	Rectangle(){
		
	}
	
	Rectangle(double w, double h){
		width = w;
		height = h;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return width * 2 + height * 2;
	}
	
}
