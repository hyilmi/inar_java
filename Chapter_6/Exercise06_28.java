package chapter6;

public class Exercise06_28 {

	public static void main(String[] args) {
		System.out.println("p\t2^p-1");
		System.out.println("-------------");
		
		for (int i = 1; i <= 31; i++) {
			if(isPrime(i) && isPrime(mersennePrime(i))) {
				System.out.print(i + "\t");
				System.out.println(mersennePrime(i));
			}
		}
		
	}

	public static boolean isPrime(int x) {
		if(x == 1) {
			return false;
		}
		
		boolean isPrime = true;
		int n = 2;

		while (n <= x / 2) {
			if (x % n == 0) {
				isPrime = false;
				break;
			}
			n++;

		}
		return isPrime;
	}
	
	public static int mersennePrime(int x) {
		return (int)(Math.pow(2, x) - 1);
		
	}
	
	
	
	
}