package chapter4;
import java.util.Scanner;

public class Exercise04_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 - 15): ");
		int decimalValue = input.nextInt();
		
		if (0 <= decimalValue && decimalValue <= 9) {
			System.out.print("The hex value is " + decimalValue);
		}else if (10 <= decimalValue && decimalValue <= 15) {
			decimalValue %= 10;
			char ch = (char)('A' + decimalValue);
			System.out.println("The hex value is " + ch);
		}else {
			System.out.println("Invalid input.");
		}
		
		
	}

}
