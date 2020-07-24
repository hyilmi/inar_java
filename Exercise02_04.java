package chapter2;
import java.util.Scanner;

public class Exercise02_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value in pounds: ");
		double pounds = input.nextDouble();
		double kilos = pounds * 0.454;
		
		System.out.println(pounds + " pounds equals " + kilos + " kilos.");
		

	}

}
