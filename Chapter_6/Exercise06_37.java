package chapter6;

import java.util.Scanner;

public class Exercise06_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		System.out.println("Enter format width: ");
		int width = input.nextInt();
		
		System.out.println(format(number, width));
		
		input.close();

	}

	private static String format(int number, int width) {
		String numberString = number + "";
		
		if (numberString.length() <= width) {
			int zeroes = width - numberString.length();
			
			for (int i = 0; i < zeroes; i++) {
				numberString = "0" + numberString;
			}
		}
		
		return numberString;
	}

}
