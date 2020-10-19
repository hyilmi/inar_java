package chapter10;

import java.math.BigInteger;

public class Exercise10_17 {

	public static void main(String[] args) {
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		BigInteger sqrt = number.sqrt();
		for (int i = 0; i < 10; i++) {
			sqrt = sqrt.add(new BigInteger(1 + ""));
			System.out.println(sqrt.multiply(sqrt));
		}
	}

}
