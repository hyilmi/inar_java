package chapter5;

public class Exercise05_19 {

	public static void main(String[] args) {
		int totalLines = 8;
		
		for (int line = 1; line <= totalLines; line++) {
			for (int spaces = totalLines - line; spaces > 0; spaces--) {
				System.out.print("    ");
			}
			
			for (int up = 0; up < line; up++) {
				System.out.printf("%4d", (int)(Math.pow(2, up)));
			}
			
			for (int down = line-2; down >= 0 ; down--) {
				System.out.printf("%4d", (int)(Math.pow(2, down)));
			}
			System.out.println("");
		}

	}

}
