package chapter5;

import java.util.Scanner;

public class Exercise05_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		System.out.print("Enter first day of the year (1-Monday, 2-Tuesday...): ");
		int day = input.nextInt();
		
		String result = "";
		
		for (int i = 1; i <= 12; i++) {
			result = "";
			
			switch(i) {
			case 1: result += "January "; break;
			case 2: result += "Febuary "; break;
			case 3: result += "March "; break;
			case 4: result += "April "; break;
			case 5: result += "May "; break;
			case 6: result += "June "; break;
			case 7: result += "July "; break;
			case 8: result += "August "; break;
			case 9: result += "September "; break;
			case 10: result += "October "; break;
			case 11: result += "November "; break;
			case 12: result += "December "; break;
			}
			
			result += "1, " + year + " is ";
			
			day = day % 7;
					
			switch(day) {
			case 0: result += "Sunday"; break;
			case 1: result += "Monday"; break;
			case 2: result += "Tuesday"; break;
			case 3: result += "Wednesday"; break;
			case 4: result += "Thursday"; break;
			case 5: result += "Friday"; break;
			case 6: result += "Saturday"; break;
			
			}
			
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11) {
				day += 31;
			}else if (i == 4 || i == 6 || i == 8 || i == 10 || i == 12){
				day += 30;
			}else {
				if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					day += 29;
				}else {
					day += 28;
				}
			}
			System.out.println(result);
			
		}
		
	
		
			
		
	}

}
