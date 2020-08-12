package chapter5;

public class Exercise05_15 {

	public static void main(String[] args) {
		int ch1 = '!';
		int ch2 = '~';
		int count = 0;
		
		for (int i = ch1; i <= ch2; i++) {
			System.out.print((char)i + " ");
			count++;
			
			if (count % 10 == 0) {
				System.out.println("");
			}
		}

	}

}
