package chapter5;

import java.util.Scanner;

public class Exercise05_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal to convert to binary: ");
		int decimal = input.nextInt();
		String binary = "";
		
		if(decimal == 0) {
			System.out.println("0 in binary is 0");
			System.exit(0);
		}
		
		int dividend = decimal;
		while (dividend != 0) {
			int remainder = dividend % 2;
			binary = remainder + binary;
			dividend /= 2;
		}
		System.out.println(decimal + " in binary is " + binary);

	}

}
