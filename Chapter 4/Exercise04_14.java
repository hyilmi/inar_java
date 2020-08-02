package chapter4;

import java.util.Scanner;

public class Exercise04_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter grade: ");
		char letterGrade = input.next().charAt(0);
		letterGrade = Character.toUpperCase(letterGrade);

		if (65 <= letterGrade && letterGrade <= 70 && letterGrade != 'E') {
			System.out.print("The numeric value for grade " + letterGrade + " is ");
			switch (letterGrade) {
			case 'A':
				System.out.print("4");
				break;
			case 'B':
				System.out.print("3");
				break;
			case 'C':
				System.out.print("2");
				break;
			case 'D':
				System.out.print("1");
				break;
			case 'F':
				System.out.print("0");
				break;
			}

		} else {
			System.out.print(letterGrade + " is an invalid grade.");
		}

	}

}
