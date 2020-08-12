package chapter5;

import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int students = input.nextInt();
		
		int score = 0;
		int firstScore = 0;
		int secondScore = 0;
		String name = "";
		String firstName = "";
		String secondName = "";
		
		for (int i = 1; i <= students; i++) {
			System.out.print("Enter name and score of student " + i + ": ");
			name = input.next();
			score = input.nextInt();
			
			if(score > secondScore) {
				if(score > firstScore) {
					firstScore = score;
					firstName = name;
					
				}else {
					secondScore = score;
					secondName = name;
				}
				
			}
			
		}
		System.out.println(firstName + firstScore);
		System.out.println(secondName + secondScore);
		
		

	}

}
