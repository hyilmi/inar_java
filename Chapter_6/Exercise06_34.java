package chapter6;

import java.util.Scanner;

public class Exercise06_34 {
// TODO implement zeller algorithm 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = input.nextInt();

		System.out.print("Enter month as a number (1-12): ");
		int month = input.nextInt();

		printMonth(year, month);

	}

	private static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);

	}

	private static void printMonthBody(int year, int month) {
		int startDay = getStartDay(year, month);
		int numberOfDays = getNumberOfDays(year, month);

		for (int i = 0; i < startDay; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= numberOfDays; i++) {
			System.out.printf("%3d ", i);
			if ((i + startDay) % 7 == 0) {
				System.out.println("");
			}
		}
	}

	private static int getNumberOfDays(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}

		}
		return 0;
	}

	private static int getStartDay(int year, int month) {
		int dayOne = 3;
		int totalDaysSinceDayOne = totalDaysSinceDayOne(year, month);

		return (dayOne + totalDaysSinceDayOne) % 7;
	}

	private static int totalDaysSinceDayOne(int year, int month) {
		int total = 0;
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i)) {
				total += 366;
			} else {
				total += 365;
			}
		}
		return 0;
	}

	private static boolean isLeapYear(int i) {
		return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
	}

	private static void printMonthTitle(int year, int month) {
		System.out.println("\t  " + getMonthName(month) + " " + year);
		System.out.println("---------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

	}

	private static String getMonthName(int month) {
		switch (month) {
		case 1:
			return "JAN";
		case 2:
			return "FEB";
		case 3:
			return "MAR";
		case 4:
			return "APR";
		case 5:
			return "MAY";
		case 6:
			return "JUN";
		case 7:
			return "JUL";
		case 8:
			return "AUG";
		case 9:
			return "SEP";
		case 10:
			return "OCT";
		case 11:
			return "NOV";
		case 12:
			return "DEC";
		default:
			return null;
		}

	}

}
