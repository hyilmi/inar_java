package chapter5;

public class Exercise05_27 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i <= 2100; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				count++;
				System.out.print(i + " ");
				if (count % 10 == 0) {
					System.out.println("");
				}
			}

		}

	}

}
