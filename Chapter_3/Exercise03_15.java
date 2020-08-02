package chapter3;

import java.util.Scanner;

public class Exercise03_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lotteryNumber = (int)(Math.random()*900) + 100;
		
		int lotteryNumber1 = lotteryNumber % 10;
		int lotteryNumber2 = (lotteryNumber / 10) % 10;
		int lotteryNumber3 = lotteryNumber / 100;
		
		System.out.print("Enter your 3-digit lottery number: ");
		int userNumber = input.nextInt();
		
		//Get digits from the user's lotto number
		int userNumber1 = userNumber % 10;
		int userNumber2 = (userNumber / 10) % 10;
		int userNumber3 = userNumber / 100;
		
		if(userNumber == lotteryNumber) {
			System.out.println("Exact match. You win $10.000!");
		}else if ((userNumber1 == lotteryNumber1 || userNumber1 == lotteryNumber2 || userNumber1 == lotteryNumber3)
				&& (userNumber2 == lotteryNumber1 || userNumber2 == lotteryNumber2 || userNumber2 == lotteryNumber3)
				&& (userNumber3 == lotteryNumber1 || userNumber3 == lotteryNumber2 || userNumber3 == lotteryNumber3)){
			System.out.println("Matched all digits. You win $3.000!");
			
		}else if ((userNumber1 == lotteryNumber1 || userNumber1 == lotteryNumber2 || userNumber1 == lotteryNumber3)
				|| (userNumber2 == lotteryNumber1 || userNumber2 == lotteryNumber2 || userNumber2 == lotteryNumber3)
				|| (userNumber3 == lotteryNumber1 || userNumber3 == lotteryNumber2 || userNumber3 == lotteryNumber3)) {
			System.out.println("Matched one digit. You win $1.000!");
		}else {
			System.out.println("Sorry, no match.");
		}
		

	}

}
