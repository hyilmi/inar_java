package chapter3;

import java.util.Scanner;

public class Exercise03_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temp in Fahrenheit between -58F and 41F: ");
		double temperature = input.nextDouble();
		
		if (!(-58 < temperature && temperature < 41)) {
			System.out.println("Invalid temperature.");
			System.exit(1);
		}
		
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		if(!(2 <= windSpeed)) {
			System.out.println("Invalid temperature.");
			System.exit(1);
		}
		
		double windChillIndex = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + 
				(0.4275 * temperature * Math.pow(windSpeed, 0.16));
		
		System.out.println("The wind chill index is " + windChillIndex);		
				
				
			
			
			
		
		
		
		

	}

}
