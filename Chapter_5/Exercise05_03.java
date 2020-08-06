package chapter5;

public class Exercise05_03 {

	public static void main(String[] args) {
		final double KG_TO_LBS = 2.2;
		
		System.out.print("KILOGRAMS");
		System.out.print("\tPOUNDS\n");
		
		int kg = 1;
		for (int i = 0; i < 100; i++) {
			System.out.print(kg);
			System.out.printf("\t\t%.1f\n", kg*KG_TO_LBS);
			kg += 2;
			
		}

	}

}
