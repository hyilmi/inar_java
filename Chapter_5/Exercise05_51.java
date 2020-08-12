package chapter5;

import java.util.Scanner;

public class Exercise05_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1 = input.nextLine();
		System.out.println("Enter the second string: ");
		String s2 = input.nextLine();
		
		String prefix = "";
		int i = 0;
		
		while (s1.charAt(i) == s2.charAt(i)) {
			prefix += s1.charAt(i);
			i++;
		}
		if(prefix.length() == 0) {
			System.out.println("The strings have no common prefix.");
		}else {
			System.out.println("The common prefix is \"" + prefix + "\"");
		}
		
		
		
		
		}


	}


