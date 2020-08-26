package chapter6;

public class Exercise06_29 {

	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			//imported isPrime() method from Exercise06_28
			if(Exercise06_28.isPrime(i) && Exercise06_28.isPrime(i + 2)) {
				System.out.printf("(%d, %d)\n", i, i+2);
			}
		}

	}

}
