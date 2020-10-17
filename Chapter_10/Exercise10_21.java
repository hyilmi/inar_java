package chapter10;

import java.math.BigInteger;

public class Exercise10_21 {

	public static void main(String[] args) {
		BigInteger n = new BigInteger(new BigInteger("10").pow(50) + "");
		int count = 0;

		BigInteger five = new BigInteger("5");
		BigInteger six = new BigInteger("6");

		while (count < 10) {
			if (BigInteger.ZERO.compareTo(n.remainder(five)) == 0
					|| BigInteger.ZERO.compareTo(n.remainder(six)) == 0) {
				System.out.println(n);
				count++;

			}

			n = n.add(BigInteger.ONE);

		}

	}
}
