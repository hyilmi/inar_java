package chapter7;

import java.util.Scanner;

public class Exercise07_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		double mean = mean(numbers);
		double deviation = deviation(numbers);
		
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + deviation);
		
	}
	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;
	}
	public static double deviation(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += Math.pow(x[i] - mean(x), 2);
		}
		return Math.pow(sum / (x.length - 1), 0.5);
	}

}
