package chapter10;

import java.util.Scanner;

public class Exercise10_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter equation: ");
		String equation = input.nextLine();
		String s = equation.replaceAll(" ", "");
		
		s = s.replaceAll("[+]","#+#");
		s = s.replaceAll("[-]","#-#");
		s = s.replaceAll("[*]","#*#");
		s = s.replaceAll("[/]","#/#");
		
		String[] arr = s.split("#");

		int num1 = Integer.parseInt(arr[0]);
		char operator = arr[1].charAt(0);
		int num2 = Integer.parseInt(arr[2]);

		int result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '.':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}
