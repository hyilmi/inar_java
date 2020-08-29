package chapter6;

public class Exercise06_38 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(getUppercaseLetter());
			if (i % 10 == 0) {
				System.out.println("");
			}
		}
		for (int i = 1; i <= 100; i++) {
			System.out.print(getDigit());
			if (i % 10 == 0) {
				System.out.println("");
			}
		}

	}

	private static char getDigit() {
		return (char)(Math.random() * ('9' - '0' + 1) + '0');
	}

	private static char getUppercaseLetter() {
		return (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
	}

}
