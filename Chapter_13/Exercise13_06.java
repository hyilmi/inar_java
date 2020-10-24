package chapter13;

public class Exercise13_06 {

	public static void main(String[] args) {
		ComparableCircle cc1 = new ComparableCircle(12);
		ComparableCircle cc2 = new ComparableCircle(15);
		ComparableCircle maxCC = cc1.max(cc2);
		
		System.out.println("The bigger circle is " + maxCC);
		

	}

}
