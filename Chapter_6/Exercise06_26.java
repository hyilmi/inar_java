package chapter6;

public class Exercise06_26 {

	public static void main(String[] args) {
		int count = 0;
		int prime = 2;
		while (count <= 100) {
			if (Exercise06_28.isPrime(prime) && isPalindrome(prime)) {
				System.out.print(prime + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println("");
				}
				prime++;
			} else {
				prime++;
			}
		}

	}

	public static boolean isPalindrome(int prime) {
		String primeNum = prime + "";
		boolean isPalindrome = true;
		for (int i = 0, j = primeNum.length() - 1; i <= j; i++, j--) {
			if (primeNum.charAt(i) != primeNum.charAt(j)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;

	}

}
