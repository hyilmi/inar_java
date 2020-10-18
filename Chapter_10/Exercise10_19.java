package chapter10;

import java.math.BigInteger;

public class Exercise10_19 {

	public static void main(String[] args) {
		System.out.println("p     2^p - 1");

		for (BigInteger i = BigInteger.TWO; i.compareTo(new BigInteger("100")) <= 0; i = i.add(BigInteger.ONE)) {
			
			if (isPrime(mersennePrime(i))) {
				System.out.printf("%3d", i);
				System.out.printf("%10d\n", mersennePrime(i));
				
			}
		}
	}

	public static BigInteger mersennePrime(BigInteger n) {
		BigInteger two = new BigInteger("2");
		BigInteger x = new BigInteger("2");
		
		for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0; i = i.add(new BigInteger("1"))) {
			x = x.multiply(two);
		}
		 
		return x.subtract(new BigInteger("1"));
	}

	public static boolean isPrime(BigInteger n) {
		for (BigInteger i = BigInteger.TWO; i.compareTo(n.divide(BigInteger.TWO)) <= 0; i = i.add(BigInteger.ONE)) {

			if (n.remainder(i).compareTo(BigInteger.ZERO) == 0) {
				return false;
			}
		}
		return true;
	}
}
