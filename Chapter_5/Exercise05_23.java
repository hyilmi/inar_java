package chapter5;

public class Exercise05_23 {

	public static void main(String[] args) {
		double totalLR = 0;
		for (double i = 1; i < 50_000; i++) { // why double i = 0?

			totalLR = totalLR + 1 / i;
		}
		System.out.println("1 + 1/2 + 1/3 + ... 1/50000 = " + totalLR);

		double totalRL = 0;
		for (double i = 50000; i >= 1; i--) {
			
			totalRL = totalRL + 1 / i;
		}
		System.out.println("1/50000 + ... 1/3 + 1/2 + 1 = " + totalRL);
	}

}
