package chapter7;

import java.util.Scanner;

public class Exercise07_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		System.out.println("Enter " + numberOfStudents + " scores: ");

		int[] scores = new int[numberOfStudents];
		int max = 0;
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
			if (scores[i] > max) {
				max = scores[i];
			}
		}

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("Student %d score is %d and grade is ", i, scores[i]);
			if ((max - 10) <= scores[i]) {
				System.out.println("A");
			} else if ((max - 20) <= scores[i] && scores[i] < (max - 10)) {
				System.out.println("B");
			} else if ((max - 30) <= scores[i] && scores[i] < (max - 20)) {
				System.out.println("C");
			} else if ((max - 40) <= scores[i] && scores[i] < (max - 30)) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}

	}

}
