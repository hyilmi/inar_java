package chapter13;

public class Exercise13_11 {

	public static void main(String[] args) {
		Octagon o1 = new Octagon(5);
		System.out.println("Area : " + o1.getArea());
		System.out.println("Perimeter: " + o1.getPerimeter());

		try {
			Octagon clone = (Octagon) o1.clone();
			if (o1.compareTo(clone) == 1) {
				System.out.println("Octagon 1 is bigger");
			} else if (o1.compareTo(clone) == 0) {
				System.out.println("They're equal");
			} else {
				System.out.println("Clone is bigger");
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
