package chapter5;

public class Exercise05_04 {

	public static void main(String[] args) {
		final double M_TO_KM = 1.609;
		
		System.out.print("MILES");
		System.out.print("\tKILOMETERS\n");
		
		int miles = 1;
		for(int i = 0; i < 10; i++) {
			System.out.print(miles);
			System.out.printf("\t%.3f\n", miles*M_TO_KM);
			miles++;
		}

	}

}
