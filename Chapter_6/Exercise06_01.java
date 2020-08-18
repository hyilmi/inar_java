package chapter6;

public class Exercise06_01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%5d ", pentagonalNumbers(i));
			if (i % 10 == 0) {
				System.out.println("");
			}
		}

	}

	public static int pentagonalNumbers(int n) {
		int num = n * (3 * n - 1) / 2;
		return num;
	}

}
