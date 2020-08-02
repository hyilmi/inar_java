package chapter3;

import java.util.Scanner;

public class Exercise03_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 0 for heads, 1 for tails: ");
		int guess = input.nextInt();
		
		int randomNumber = (int)(Math.random()*10);
		int headsOrTails = randomNumber % 2;
		
		if (headsOrTails == 0) {
			System.out.print("Heads. ");
		}else {
			System.out.print("Tails. ");
		}
		
		if (headsOrTails == guess) {
			System.out.println("You win!");
		}else {
			System.out.println("You lose.");
		}

	}

}
