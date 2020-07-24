package chapter2;
import java.util.Scanner;

public class Exercise02_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kg: ");
		double water = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemp = input.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		double finalTemp = input.nextDouble();
		
		double energy = water * (finalTemp - initialTemp) * 4184;
		System.out.println("The energy needed is " + energy);

	}

}
