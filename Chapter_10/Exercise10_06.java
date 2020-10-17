package chapter10;

import java.util.Stack;

public class Exercise10_06 {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();
		StackOfIntegers stack2 = new StackOfIntegers();
		
		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}
		
		while(!stack.empty()) {
			stack2.push(stack.pop());
		}
		
		while(!stack2.empty()) {
			System.out.print(stack2.pop() + " ");
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
