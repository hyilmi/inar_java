package chapter3;

import java.util.Scanner;

public class Exercise03_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		int total = number1 + number2 + number3;
		
		/*System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);*/
		
		System.out.println("What is " + number1 + " + " + number2 
				+ " + " + number3 + "?");
		int answer = input.nextInt();
		
		if (answer == total) {
			System.out.println("Correct.");
		}else {
			System.out.println("Incorrect. The answer is " + (number1+number2+number3));
		}
		
		

	}

}
