package chapter2;
import java.util.Scanner;

public class Exercise02_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		int hours = minutes / 60;
		int days = hours / 24;
		int years = days / 365;
		int leftDays = days % 365;
		
		System.out.println(minutes + " minutes is appr. " + years + " years and " +
		leftDays + " days.");
		
	}

}
