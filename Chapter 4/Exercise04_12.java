package chapter4;

import java.util.Scanner;

public class Exercise04_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		char ch = input.nextLine().charAt(0);
		
		if (('A' <= ch && ch <= 'F') || ('1' <= ch && ch <= '9')){
			System.out.print("The binary value is ");
			switch(ch) {
			case '1': System.out.println("0001");break;
			case '2': System.out.println("0010");break;
			case '3': System.out.println("0011");break;
			case '4': System.out.println("0100");break;
			case '5': System.out.println("0101");break;
			case '6': System.out.println("0110");break;
			case '7': System.out.println("0111");break;
			case '8': System.out.println("1000");break;
			case '9': System.out.println("1001");break;
			case 'A': System.out.println("1010");break;
			case 'B': System.out.println("1011");break;
			case 'C': System.out.println("1100");break;
			case 'D': System.out.println("1101");break;
			case 'E': System.out.println("1110");break;
			case 'F': System.out.println("1111");break;
			}
			
		}else {
			System.out.println("Invalid input.");
		}
	}

}
