package chapter3;

import java.util.Scanner;

public class Exercise03_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter todays day (1-7): ");
		int today = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		int futureDay = (today + daysElapsed) % 7;
		
		System.out.print("Today is");
		switch (today) {
		case 1 : System.out.print(" Monday ");break;
		case 2 : System.out.print(" Tuesday ");break;
		case 3 : System.out.print(" Wednesday ");break;
		case 4 : System.out.print(" Thursday ");break;
		case 5 : System.out.print(" Friday ");break;
		case 6 : System.out.print(" Saturday ");break;
		case 7 : System.out.print(" Sunday ");break;
		}
		
		System.out.print("and the next day is");
		switch (futureDay) {
		case 1 : System.out.print(" Monday ");break;
		case 2 : System.out.print(" Tuesday ");break;
		case 3 : System.out.print(" Wednesday ");break;
		case 4 : System.out.print(" Thursday ");break;
		case 5 : System.out.print(" Friday ");break;
		case 6 : System.out.print(" Saturday ");break;
		case 7 : System.out.print(" Sunday ");break;
		}
		
	
		
		
		
	}
	

}
