package chapter6;

public class Exercise06_27 {

	public static void main(String[] args) {
		int count = 0;
		int prime = 2;
		while (count <= 100) {
			if (Exercise06_28.isPrime(prime) && !Exercise06_26.isPalindrome(prime)) {
				System.out.print(prime + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println("");
				}
				prime++;
			}
			prime++;

		}

	}

}
