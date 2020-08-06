package chapter5;

import java.util.Scanner;

public class Exercise05_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NUMBER_OF__QUESTIONS = 10;
		long beginTime = System.currentTimeMillis();

		int questions = 0;
		int correctCount = 0;
		while (questions < NUMBER_OF__QUESTIONS) {

			int number1 = (int) (Math.random() * 15) + 1;
			int number2 = (int) (Math.random() * 15) + 1;
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();

			if (answer == number1 + number2) {
				correctCount++;
			}

			questions++;

		}
		long endTime = System.currentTimeMillis();
		System.out.println("You have answered " + correctCount + " questions correctly in "
				+ (endTime - beginTime) / 1000 + " seconds.");

	}

}
