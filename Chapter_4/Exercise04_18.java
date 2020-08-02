package chapter4;

import java.util.Scanner;

public class Exercise04_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two characters: ");
		String str = input.next();
		
		char major = str.charAt(0);
		major = Character.toUpperCase(major);
		char year = str.charAt(1);
		
		switch(major) {
		case 'M': System.out.print("Mathematics ");break;
		case 'C': System.out.print("Computer Science ");break;
		case 'I': System.out.print("Information Tech ");break;
		default: System.out.println("Invalid input.");System.exit(1);
		}
		switch(year) {
		case '1': System.out.print("Freshman");break;
		case '2': System.out.print("Sophomore");break;
		case '3': System.out.print("Junior");break;
		case '4': System.out.print("Senior");break;
		}
	}

}
