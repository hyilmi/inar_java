package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = {"rhythm", "phlegm", "gypsy", "syracuse", "cryptic", "egypt", "abyss", "valkryie", "xylophone", "phoenix"};
		
		int index = (int)(Math.random() * words.length);
		char[] answer = words[index].toCharArray();
		char[] result = new char[words[index].length()];
		for (int i = 0; i < result.length; i++) {
			result[i] = '*';
		}
		
		while(!Arrays.equals(result, answer)) {
			System.out.print("(Guess) Enter a letter in word ");
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i]);
			}
			System.out.print(" > ");
			char ch = input.nextLine().charAt(0);
			
			for (int i = 0; i < result.length; i++) {
				boolean inResult = false;
				boolean inAnswer = false;
				
				if (ch == result[i]) {
					inResult = true;
				}
				if(inResult) {
					System.out.println(ch + " is already in the word.");
				}
				
				if(ch == answer[i]) {
					inAnswer = true;
				}
				if(inAnswer && !inResult) {
					result[i] = answer[i];
				}
			}
			
			
		}
		
		

	}

}
