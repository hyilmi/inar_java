package chapter3;
import java.util.Scanner;

public class Exercise03_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 100);
		int num2 = (int)(Math.random() * 100);
		int total = num1 + num2;
		
		System.out.println("What is " + num1 + " + " + num2 + " ?");
		int answer = input.nextInt();
		
		if (answer == total) {
			System.out.println("Correct.");
		}else {
			System.out.println("Incorrect. The answer was " + total);
		}
		

	}

}
