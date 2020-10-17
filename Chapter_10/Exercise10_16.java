package chapter10;

import java.math.BigInteger;

public class Exercise10_16 {

	public static void main(String[] args) {
		BigInteger n = new BigInteger(new BigInteger("10").pow(50) + "");
		int count = 0;
		
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		
		while(count < 10) {
			if (BigInteger.ZERO.compareTo(n.remainder(two)) == 0 || BigInteger.ZERO.compareTo(n.remainder(three)) == 0) {
				System.out.println(n);
				count++;
				
			}
			
			n = n.add(BigInteger.ONE);
		}
	}

}
