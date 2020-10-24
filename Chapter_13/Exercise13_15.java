package chapter13;

import java.math.BigInteger;

public class Exercise13_15 {

	public static void main(String[] args) {

	}

}

class Rational extends Number implements Comparable<Rational> {
	private BigInteger[] r = new BigInteger[2];

	public Rational() {
		r[0] = new BigInteger(0 + "");
		r[1] = new BigInteger(1 + "");

	}

	public Rational(BigInteger n, BigInteger d) {
		BigInteger gcd = gcd(n, d);

		if (d.compareTo(BigInteger.ZERO) > 0) {
			r[0] = new BigInteger(n.divide(gcd) + "");
		} else {
			r[0] = new BigInteger(n.divide(gcd).multiply(new BigInteger(-1 + "")) + "");

		}

		r[1] = new BigInteger((d.divide(gcd)) + "");
	}

	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n;
		BigInteger n2 = d;
		BigInteger gcd = BigInteger.ONE;

		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
			BigInteger n1Rem = n1.remainder(k);
			BigInteger n2Rem = n2.remainder(k);

			if (n1Rem.compareTo(BigInteger.ZERO) == 0 && n2Rem.compareTo(BigInteger.ZERO) == 0)
				gcd = k;
		}

		return gcd;
	}

	public BigInteger getNumerator() {
		return r[0];
	}

	public BigInteger getDenominator() {
		return r[1];
	}

	public Rational add(Rational secondRational) {
		BigInteger secondRationalNumerator = new BigInteger(secondRational.getNumerator() + "");
		BigInteger secondRationalDenominator = new BigInteger(secondRational.getDenominator() + "");

		BigInteger n = r[0].multiply(secondRationalDenominator).add(r[1].multiply(secondRationalNumerator));
		BigInteger d = r[1].multiply(secondRationalDenominator);
		return new Rational(n, d);
	}

	public Rational subtract(Rational secondRational) {
		BigInteger secondRationalNumerator = new BigInteger(secondRational.getNumerator() + "");
		BigInteger secondRationalDenominator = new BigInteger(secondRational.getDenominator() + "");

		BigInteger n = r[0].multiply(secondRationalDenominator).subtract(r[1].multiply(secondRationalNumerator));
		BigInteger d = r[1].multiply(secondRationalDenominator);
		return new Rational(n, d);
	}

	public Rational multiply(Rational secondRational) {
		BigInteger secondRationalNumerator = new BigInteger(secondRational.getNumerator() + "");
		BigInteger secondRationalDenominator = new BigInteger(secondRational.getDenominator() + "");

		BigInteger n = r[0].multiply(secondRationalDenominator).multiply(r[1].multiply(secondRationalNumerator));
		BigInteger d = r[1].multiply(secondRationalDenominator);
		return new Rational(n, d);
	}

	public Rational divide(Rational secondRational) {
		BigInteger secondRationalNumerator = new BigInteger(secondRational.getNumerator() + "");
		BigInteger secondRationalDenominator = new BigInteger(secondRational.getDenominator() + "");

		BigInteger n = r[0].multiply(secondRationalDenominator).divide(r[1].multiply(secondRationalNumerator));
		BigInteger d = r[1].multiply(secondRationalDenominator);
		return new Rational(n, d);
	}

	@Override
	public String toString() {
		if (r[1] == BigInteger.ONE)
			return r[0] + "";
		else
			return r[0] + "/" + r[1];
	}

	@Override // Override the equals method in the Object class
	public boolean equals(Object o) {
		Rational diff = this.subtract((Rational) (o));
		BigInteger n = diff.getNumerator();
		if (n.compareTo(BigInteger.ZERO) == 0)
			return true;
		else
			return false;
	}

	@Override // Implement the abstract intValue method in Number
	public int intValue() {
		return (int) doubleValue();
	}

	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		BigInteger n = this.getNumerator();
		BigInteger d = this.getDenominator();
		return n.doubleValue() / d.doubleValue();
	}

	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	@Override // Implement the compareTo method in Comparable
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
			return -1;
		else
			return 0;
	}
}
