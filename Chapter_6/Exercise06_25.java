package chapter6;

import java.util.Scanner;

public class Exercise06_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter milliseconds: ");
		double milliseconds = input.nextDouble();
		
		System.out.println(convert(milliseconds));
		input.close();

	}

	private static String convert(double milliseconds) {
		
		int seconds = (int)((milliseconds / 1000) % 60) ;
		int minutes = (int)((milliseconds / (1000 * 60)) % 60); 
		int hours   = (int)(milliseconds / (1000 * 60 * 60));
		
		String format = hours + ":" + minutes + ":" + seconds;
		
		return format;
	}

}
