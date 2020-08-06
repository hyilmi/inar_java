package chapter5;

public class Exercise05_07 {

	public static void main(String[] args) {
		final double INCREASE_RATE = 0.05;
		double tuition = 10_000;
		
		System.out.printf("Year 1: " + "$%.2f\n", tuition);
		
		for(int year = 2; year <= 10; year++) {
			tuition = tuition + (tuition * INCREASE_RATE);
			System.out.printf("Year " + year +": $%.2f\n", tuition);
		}
		for (int i = 0; i < 4; i++) {
			tuition += tuition + (tuition * INCREASE_RATE);
			
		}
		System.out.printf("Total tuition of years 11, 12, 13 and 14: $%.2f", tuition);
		

	}

}
