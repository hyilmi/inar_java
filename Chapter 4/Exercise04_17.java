package chapter4;

import java.util.Scanner;

public class Exercise04_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter a month: ");
		String month = input.next();

		switch (month) {
		case "Jan":
			System.out.print("Jan " + year);
			break;
		case "Feb":
			System.out.print("Feb " + year);
			break;
		case "Mar":
			System.out.print("Mar " + year);
			break;
		case "Apr":
			System.out.print("Apr " + year);
			break;
		case "May":
			System.out.print("May " + year);
			break;
		case "Jun":
			System.out.print("Jun " + year);
			break;
		case "Jul":
			System.out.print("Jul " + year);
			break;
		case "Aug":
			System.out.print("Aug " + year);
			break;
		case "Sept":
			System.out.print("Sept " + year);
			break;
		case "Oct":
			System.out.print("Oct " + year);
			break;
		case "Nov":
			System.out.print("Nov " + year);
			break;
		case "Dec":
			System.out.print("Dec " + year);
			break;
		}

		if (month.compareTo("Feb") == 0) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.print(" is 29 days.");
			} else {
				System.out.println(" is 28 days.");
			}
		} else if (month.compareTo("Jan") == 0 || month.compareTo("Mar") == 0 || month.compareTo("May") == 0
				|| month.compareTo("Jul") == 0 || month.compareTo("Sept") == 0 || month.compareTo("Nov") == 0) {
			System.out.print(" is 31 days.");
		} else {
			System.out.print(" is 30 days.");
		}

	}

}
