package chapter6;

public class Exercise06_10 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 10000; i++) {
			if(isPrime(i)) {
				count++;
				System.out.printf("%5d", i);
				if(count % 10 == 0) {
					System.out.println("");
				}
			}
			
		}

	}
	
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor < number ; divisor++) {
			if(number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
