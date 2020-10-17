package chapter10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise10_18 {

	public static void main(String[] args) {
		BigInteger base = new BigInteger(Long.MAX_VALUE + "");
		int count = 0;
		while (count < 5) {
			boolean isPrime = true;

			if (isPrime(base)) {
				count++;
				System.out.println(base);
			}

			base = base.add(BigInteger.ONE);

		}
	}

	public static boolean isPrime(BigInteger base) {
		for (BigInteger index = new BigInteger(2 + ""); (base.divide(BigInteger.TWO)).compareTo(index) > 0; index = index
				.add(new BigInteger(1 + ""))) {

			if (base.remainder(index).compareTo(BigInteger.ZERO) == 0) {
				return false;
			}
		}
		return true;

	}
}
