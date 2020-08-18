package chapter6;

public class Exercise06_14 {

	public static void main(String[] args) {
		
		System.out.print("i     |     m(i)\n");
		System.out.println("------------------");
		
		int i = 1;
		
		for (int j = 0; j < 10; j++) {
			System.out.printf("%-3d         ", i);
			System.out.printf("%5.4f\n", m(i));
			i += 100;
		}

	}

	public static double m(int i) {
		double sum = 0;
		
		for (double j = 1; j <= i; j++) {
			sum += Math.pow(-1, j+1) / (2 * j - 1);
		}
		return 4 * sum;
		
	}

}
