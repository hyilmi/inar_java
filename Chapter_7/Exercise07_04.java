package chapter7;

import java.util.Scanner;

public class Exercise07_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter grades (1-100)(0 to end): ");
		
		double[] grades = new double[101];
		int grade = -1;
			
		while (grade != 0) {
			grade = input.nextInt();
			if(grade == 0) {
				break;
			}
			grades[grade]++;
		}
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] != 0) {
				sum += i;
				count++;
			}
		}
		int average = sum / count;
		
		int underAverage = 0;
		int equalToAverage = 0;
		int aboveAverage = 0;
		
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] != 0) {
				if (i < average) {
					underAverage++;
				}else if(i == average) {
					equalToAverage++;
				}else {
					aboveAverage++;
				}
			}
		}
		System.out.println("The average is " + average);
		System.out.println("There are " + underAverage + " grades under average.");
		System.out.println("There are " + equalToAverage + " grades equal to the average.");
		System.out.println("Therea are " + aboveAverage + " grades above average.");

	}

}
