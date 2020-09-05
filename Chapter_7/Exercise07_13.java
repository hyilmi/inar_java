package chapter7;

public class Exercise07_13 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int random = getRandom(1, 2, 3, 4, 5, 6, 7, 8, 9);
			System.out.print(random + " ");
			if((i + 1) % 20 == 0) {
				System.out.println("");
			}
		}

	}

	public static int getRandom(int... numbers) {
		int n = 0;
		boolean inNumbers;
		do {
			inNumbers = false;
			n = (int) (Math.random() * 54) + 1;
			for (int i = 0; i < numbers.length; i++) {
				if(n == numbers[i]) {
					inNumbers = true;
				}
			}
			
		}while(inNumbers);
		
		return n;
		
	}

}
