package chapter2;
import java.util.Scanner;

public class Exercise02_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int a = number % 10;
		int b = number / 10;
		int c = b % 10;
		int d = b / 10;
		
		System.out.println(a + c + d);
	

	}

}
