package chapter2;
import java.util.Scanner;

public class Exercise02_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double gallonsOfFuel = distance / milesPerGallon;
		double cost = gallonsOfFuel * pricePerGallon;
		
		System.out.println("Total cost of driving: $" + cost);

	}

}
