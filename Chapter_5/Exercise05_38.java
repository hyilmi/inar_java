package chapter5;

import java.util.Scanner;

public class Exercise05_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal to convert to octal: ");
		int decimal = input.nextInt();
		String octal = "";
		
		if(decimal == 0) {
			System.out.println("0 in octal is 0");
			System.exit(0);
		}
		
		int dividend = decimal;
		while (dividend != 0) {
			int remainder = dividend % 8;
			octal = remainder + octal;
			dividend /= 8;
		}
		System.out.println(decimal + " in octal is " + octal);


	}

}
