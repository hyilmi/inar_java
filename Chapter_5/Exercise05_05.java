package chapter5;

public class Exercise05_05 {

	public static void main(String[] args) {
		//format baya sacma oldu kb
		final double KG_TO_LBS = 2.2;
		
		System.out.printf("KILOGRAMS");
		System.out.printf("%10s","POUNDS");
		System.out.printf("%7s","|");
		System.out.printf("%10s","POUNDS");
		System.out.printf("%16s","KILOGRAMS\n");
		
		int kg = 1;
		int lbs = 20;
		
		for (int i = 0; i < 100; i++) {
			System.out.printf("%9s", kg);
			System.out.printf("%10.1f", kg*KG_TO_LBS);
			System.out.printf("%7s","|");
			System.out.printf("%10d", lbs);
			System.out.printf("%15.2f\n", lbs/KG_TO_LBS);
			
			kg += 2;
			lbs += 5;
			
			
		}
	}

}
