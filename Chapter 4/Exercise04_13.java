package chapter4;

import java.util.Scanner;

public class Exercise04_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		char ch = input.next().charAt(0);
		int ASCIIcode = (int)ch; 
		
		boolean ifLetter = (65 <= ASCIIcode && ASCIIcode <= 90) || (97 <= ASCIIcode && ASCIIcode <= 122);
		
		boolean ifVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
				 || ch == 'I'|| ch == 'O' || ch == 'U';
		
		if (!ifLetter) {
			System.out.println(ch + " is an invalid input.");
			System.exit(1);
		}
		if (ifVowel) {
			System.out.println(ch +" is a vowel.");
		}else {
			System.out.println(ch +" is a consonant.");
		}
					
		

	}

}
