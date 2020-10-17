package chapter12;

import java.util.Scanner;

public class Exercise12_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String hex = "";

		System.out.print("Enter a hex number: ");
		hex = input.nextLine();

		try {
			System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		} catch (NumberFormatException e) {
			System.out.println("Invalid input");
		}

	}

	public static int hexToDecimal(String hex) throws NumberFormatException {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			if (!('0' <= hex.charAt(i) && hex.charAt(i) <= '9') || !('A' <= hex.charAt(i) && hex.charAt(i) <= 'F')) {
				throw new NumberFormatException();
			}
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);

		}

		return decimalValue;
	}

	public static int hexCharToDecimal(char ch){
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}
