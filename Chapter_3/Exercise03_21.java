package chapter3;

import java.util.Scanner;

public class Exercise03_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		System.out.print("Enter month (1-12): ");
		int month = input.nextInt();
		
		System.out.print("Enter day of the month (1-31): ");
		int dayOfMonth = input.nextInt();
		
		int century = year / 100;
		int yearInCentury = year % 100;
		
		if (month == 1 || month == 2) {
			month += 12;
			year--;
		}
		
		int dayOfWeek = (dayOfMonth + 26*(month + 1)/10 + yearInCentury + yearInCentury/4 + century/4 + 5*century) % 7;
		
		System.out.print("The day of the week is ");
		
		switch (dayOfWeek) {
		case 0: System.out.print("Saturday");break;
		case 1: System.out.print("Sunday");break;
		case 2: System.out.print("Monday");break;
		case 3: System.out.print("Tuesday");break;
		case 4: System.out.print("Wednesday");break;
		case 5: System.out.print("Thursday");break;
		case 6: System.out.print("Friday");break;
		}
		
		
	}

}
