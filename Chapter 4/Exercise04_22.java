package chapter4;

import java.util.Scanner;

public class Exercise04_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str1 = input.nextLine();
		
		System.out.println("Enter another string: ");
		String str2 = input.nextLine();
		
		boolean substring = str1.contains(str2);
		
		if(substring) {
			System.out.println("The second string is inside of the first string");
		}else {
			System.out.println("The second string is NOT inside of the first string");
		}
	}

}
