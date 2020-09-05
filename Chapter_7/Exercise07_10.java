package chapter7;

import java.util.Scanner;

public class Exercise07_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 real numbers: ");
		
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println("The index of the smallest number is " + indexOfSmallestElement(numbers));
		
		
	}
	public static int indexOfSmallestElement(double[] array) {
		double number = array[0];
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(number > array[i]) {
				double temp = number;
				number = array[i];
				array[i] = temp;
				
				index = i;
			}
		}
		
		return index;
	}

}
