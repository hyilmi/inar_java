package chapter3;
import java.util.Scanner;

public class Exercise03_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
		int amount = input.nextInt();

		int remainingAmount = amount;

		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount / 100.0 + " consists of");
		
		if (numberOfOneDollars > 1){
			System.out.println(" " + numberOfOneDollars + " dollars");
		}else if (numberOfOneDollars == 0) {
			System.out.print("");
		}
		else {
			System.out.println(" " + numberOfOneDollars + " dollar");
		}
		
		if (numberOfQuarters > 1 || numberOfQuarters == 0) {
			System.out.println(" " + numberOfQuarters + " quarters");
		}else {
			System.out.println(" " + numberOfQuarters + " quarter");
		}
		
		if (numberOfDimes > 1 || numberOfDimes == 0) {
			System.out.println(" " + numberOfDimes + " dimes");
		}else {
			System.out.println(" " + numberOfDimes + " dime");
		}
		
		if (numberOfNickels > 1 || numberOfNickels == 0) {
			System.out.println(" " + numberOfNickels + " nickels");
		}else {
			System.out.println(" " + numberOfNickels + " nickel");
		}
		
		if (numberOfPennies > 1 || numberOfPennies == 0) {
			System.out.println(" " + numberOfPennies + " pennies");
		}else {
			System.out.println(" " + numberOfPennies + " penny");
		}
		

	}

}















