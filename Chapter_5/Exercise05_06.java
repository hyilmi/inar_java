package chapter5;

public class Exercise05_06 {

	public static void main(String[] args) {
		//if its stupid but it works, it ain't stupid
		final double M_TO_KM = 1.609;
		System.out.printf("MILE\t");
		System.out.printf("KILOMETER\t");
		System.out.printf("|\t");
		System.out.printf("KILOMETER\t");
		System.out.printf("MILE\n");
		
		int miles = 1;
		int kilometers = 20;
		for (int i = 0; i < 10; i++) {
			System.out.print(miles + "\t");
			System.out.print(miles * M_TO_KM + "\t");
			System.out.print("\t|\t");
			System.out.print(kilometers + "\t");
			System.out.printf("\t" + "%.3f" + "\n", kilometers / M_TO_KM);
			
			miles++;
			kilometers += 5;
			
		}
	}
}
