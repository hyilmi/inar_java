package chapter10;

public class Exercise10_03 {

	public static void main(String[] args) {
		

	}

}

class MyInteger {
	
	private int value;

	MyInteger(int n) {
		this.value = n;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return value % 2 == 0;
	}

	public boolean isOdd() {
		return value % 2 != 0;
	}

	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}

		return true;
	}
	
	public boolean isEven(MyInteger myInteger) {
		return isEven(myInteger);
	}
	
	public boolean isOdd(MyInteger myInteger) {
		return isOdd(myInteger);
	}
	
	public boolean isPrime(MyInteger myInteger) {
		return isPrime(myInteger);
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger myInteger) {
		return myInteger.value == this.value;
	}
	
	public int parseInt(String s) {
		//TODO
		return 0;
	}
	
	public int parseInt(char[] ch) {
		//TODO
		return 0;
	}
	
	
	
	
}