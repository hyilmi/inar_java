package chapter7;

public class Exercise07_06 {

	public static void main(String[] args) {
		int[] primes = new int[50];
		
		int count = 0;
		int primeNumber = 2;
		
		while(count < 50) {
			boolean isPrime = true;
			
			for (int i = 2; i <= Math.pow(primeNumber, 0.5); i++) {
				if(primeNumber % i == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime) {
				primes[count] = primeNumber;
				count++;
			}
			
			primeNumber++;
			
		}
		
		for (int i = 0; i < primes.length; i++) {
			System.out.print(primes[i] + " ");
		}

	}

}
