package chapter10;

import java.util.Scanner;
import java.util.Stack;

public class Exercise10_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int x = input.nextInt();

		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 2; i < x; i++) {
			if (x % i == 0 && isPrime(i)) {
				stack.push(i);
			}
		}
		
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
