package chapter5;

import java.util.Scanner;

public class Exercise05_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your 2-digit lottery number (different digits): ");
		int userNumber = input.nextInt();
		
		int userDigit1 = userNumber / 10;
		int userDigit2 = userNumber % 10;
		
		int digit1 = (int)(Math.random()*9) + 1;
		int digit2;
		
		do {
			digit2 = (int)(Math.random()*9) + 1;
		}while (digit1 == digit2);
		
		int lotteryNumber = digit1 * 10 + digit2;
		System.out.println("The lottery number is " + lotteryNumber);
		
		if(userNumber == lotteryNumber) {
			System.out.println("Exact match. You win $10.000!");
		}else if (userDigit1 == digit2 && userDigit2 == digit1) {
			System.out.println("Matched all digits. You win $3.000!");
		}else if (userDigit1 == digit1 || userDigit1 == digit2 || userDigit2 == digit1 || userDigit2 == digit2) {
			System.out.println("Matched one digit. You win $1.000!");
		}else {
			System.out.println("Sorry, no match.");
		}
		
		
	}

}
