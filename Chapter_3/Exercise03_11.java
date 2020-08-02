package chapter3;
import java.util.Scanner;

public class Exercise03_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter month (1-12): ");
		int month = input.nextInt();
		
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		switch (month) {
		case 1: System.out.print("Jan " + year);break;
		case 2: System.out.print("Feb " + year);break;
		case 3: System.out.print("Mar " + year);break;
		case 4: System.out.print("Apr " + year);break;
		case 5: System.out.print("May " + year);break;
		case 6: System.out.print("Jun " + year);break;
		case 7: System.out.print("Jul " + year);break;
		case 8: System.out.print("Aug " + year);break;
		case 9: System.out.print("Sept " + year);break;
		case 10: System.out.print("Oct " + year);break;
		case 11: System.out.print("Nov " + year);break;
		case 12: System.out.print("Dec " + year);break;
		}
		
		if (month == 2) {
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.print(" is 29 days.");
			}else {
				System.out.println(" is 28 days.");
			}
		}else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 11) {
			System.out.print(" is 31 days.");
		}else {
			System.out.print(" is 30 days.");
		}
			
		
			
		}
		
	}


