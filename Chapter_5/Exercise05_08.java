package chapter5;

import java.util.Scanner;

public class Exercise05_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double highestGrade = 0;
		String highestGradeName = "";
		
		System.out.print("Enter total number of students:");
		int students = input.nextInt();
		
		for (int i = 0; i < students; i++) {
			System.out.println("Enter name and grade of student " + (i+1) + ": ");
			String name = input.next();
			double grade = input.nextDouble();
			
			if(grade > highestGrade) {
				double temp = grade;
				grade = highestGrade;
				highestGrade = temp;
				
				highestGradeName = name;
			}
		}
		System.out.print(highestGradeName + " is in the first place with a grade of " + highestGrade);

	}

}
