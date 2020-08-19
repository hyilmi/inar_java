package chapter6;

public class Exercise06_16 {

	public static void main(String[] args) {
		for (int i = 2000; i <= 2020; i++) {
			System.out.println(i + ": " + numberOfDaysInAYear(i) + " days long");
		}

	}

	private static int numberOfDaysInAYear(int i) {
		
		if((i % 4 == 0) && (i % 10 != 0) || (i % 400 == 0)) {
			return 366;
		}else {
			return 365;
		}
		
	}

}
