package chapter6;

import java.util.Scanner;

public class Exercise06_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to find it's square root: ");
		int n = input.nextInt();
		double sqrt = sqrt(n);
		System.out.println("The square root of " + n + " is " + sqrt);

		input.close();
	}

	private static double sqrt(int n) {
		double lastGuess = 1;
		double nextGuess = (lastGuess + n / lastGuess) / 2;
		
		while(nextGuess - lastGuess > Double.MIN_VALUE) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		
		return nextGuess;
		
	}

}
