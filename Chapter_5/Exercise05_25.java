package chapter5;

public class Exercise05_25 {

	public static void main(String[] args) {
		// compute pi value for i = 10000
		double total = 0;
		for (double i = 1; i <= 10000; i++) {
			if (i % 2 == 0) {
				total = total - 1 / (2 * i - 1);
				continue;
			}
			total = total + 1 / (2 * i - 1);

		}
		System.out.println("PI (i = 10000): " + 4 * total);

		// compute pi value for i = 20000
		double total2 = 0;
		for (double i = 1; i <= 20000; i++) {
			if (i % 2 == 0) {
				total2 = total2 - 1 / (2 * i - 1);
				continue;
			}
			total2 = total2 + 1 / (2 * i - 1);

		}
		System.out.println("PI (i = 20000): " + 4 * total2);

		// compute pi value for i = 100000
		double total3 = 0;
		for (double i = 1; i <= 100000; i++) {
			if (i % 2 == 0) {
				total3 = total3 - 1 / (2 * i - 1);
				continue;
			}
			total3 = total3 + 1 / (2 * i - 1);

		}
		System.out.println("PI (i = 100000): " + 4 * total3);

	}

}
