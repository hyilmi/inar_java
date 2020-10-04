package chapter9;

import java.util.Random;

public class Exercise09_04 {

	public static void main(String[] args) {
		Random test = new Random(1000);
		
		for (int i = 0; i < 50; i++) {
			System.out.printf("%2d ", test.nextInt(100));
			if ((i+1) % 10 == 0) {
				System.out.println("");
			}
		}

	}

}
