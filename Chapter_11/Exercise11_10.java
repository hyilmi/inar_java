package chapter11;

import java.util.Scanner;

public class Exercise11_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StackClass myStack = new StackClass();
		
		System.out.println("Enter 5 strings: ");
		
		for (int i = 0; i < 5; i++) {
			String s = input.nextLine();
			myStack.add(s);
		}
		
		for (int i = 4; i >= 0 ; i--) {
			System.out.println(myStack.get(i));
		}

	}

}
