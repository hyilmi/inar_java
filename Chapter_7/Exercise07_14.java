package chapter7;

import java.util.Scanner;

public class Exercise07_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers: ");
		
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("The GCD is " + gcd(numbers));

	}
	public static int gcd(int... numbers) {
		int gcd = 1;
		int n = 2;
		
		while(n <= numbers[0] && n <= numbers[1] && n <= numbers[2] && n <= numbers[3] && n <= numbers[4]) {
			if(numbers[0] % n == 0 && numbers[1] % n == 0 && numbers[2] % n == 0 && numbers[3] % n == 0 && numbers[4] % n == 0) {
				gcd = n;
			}
			n++;
		}
		return gcd;
	}

}
