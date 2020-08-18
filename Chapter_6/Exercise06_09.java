package chapter6;

public class Exercise06_09 {

	public static void main(String[] args) {
		System.out.print("Feet\t\tMeter\t\t|\tMeter\t\tFeet\n");
		System.out.print("--------------------------------------------------------------\n");
		
		double feet = 1.0;
		double meters = 20.0;
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%.1f\t\t", feet);
			System.out.printf("%.3f\t", footToMeter(feet));
			System.out.print("\t|\t");
			System.out.printf("%.1f\t\t", meters);
			System.out.printf("%.3f\n", meterToFoot(meters));
			
			feet++;
			meters += 5.0;
			
		}

	}
	
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}
	
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
		
	}

}
