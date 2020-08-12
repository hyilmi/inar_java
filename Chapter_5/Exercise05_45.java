package chapter5;

import java.util.Scanner;

public class Exercise05_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		double sum = 0;
		double squaredSum = 0;
		
		for(int i = 0; i < 10; i++) {
			double number = input.nextDouble();
			sum += number;
			squaredSum += number*number;
			
		}
		double mean = sum / 10;
		double deviation = Math.sqrt((squaredSum - ((sum*sum)/10)) / (10-1));
		
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + deviation);
		
	}
	

}
