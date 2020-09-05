package chapter7;

import java.util.Scanner;

public class Exercise07_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 real numbers: ");
		
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		double[] reverse = reverse(numbers);
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i] + " ");
		}

	}

	public static double[] reverse(double[] array) {
		double[] result = new double[array.length];
		for (int i = 0, j = result.length - 1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	}

}
