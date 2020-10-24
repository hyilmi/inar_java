package chapter13;

public class Exercise13_12 {

	public static void main(String[] args) {
		ComparableGeometricObject[] list = {new Rectangle(3, 5), new Circle(7), new Circle(3.5) };
		System.out.println("Total area: " + sumArea(list));

	}
	
	public static double sumArea(ComparableGeometricObject[] list) {
		double sum = 0;
		
		for (int i = 0; i < list.length; i++) {
			sum += list[i].getArea();
		}
		
		return sum;
	}

}
