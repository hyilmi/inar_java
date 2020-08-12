package chapter5;

import java.util.Scanner;

public class Exercise05_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 1;
		int max = 0;
		int count = 0;
		
		System.out.print("Enter an integer (enter 0 to end input): ");
		
		while(number != 0) {
			number = input.nextInt();
			if(number > max) {
				max = number;
				count = 0;
				count++;
			}else if (number == max) {
				count++;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of " + max + " is " + count + " times.");

	}

}
