package chapter7;

import java.util.Scanner;

public class Exercise07_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		
		String names[] = new String[numberOfStudents];
		double grades[] = new double[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Student " + (i+1) + ": ");
			names[i] = input.next();
			System.out.print("Grade: ");
			grades[i] = input.nextDouble();
		}
		
		for (int i = 0; i < grades.length - 1; i++) {
			double min = grades[i];
			int minIndex = i;
			
			for (int j = i+1; j < grades.length; j++) {
				if (grades[j] < min) {
					min = grades[j];
					minIndex = j;
				}
			}
			
			double tempD = grades[minIndex];
			grades[minIndex] = grades[i];
			grades[i] = tempD;
			
			String tempS = names[minIndex];
			names[minIndex] = names[i];
			names[i] = tempS;
			
		}
		
		for (int i = numberOfStudents - 1, j = 1; i >= 0; i--, j++) {
			System.out.printf("%d. %s, %.2f\n", j, names[i], grades[i]);
		}
		
	}

}
