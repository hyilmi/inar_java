package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount of words: ");
		int size = input.nextInt();
		
		System.out.println("Enter " + size + " words to guess: ");
		String words[] = new String[size];
		for (int i = 0; i < words.length; i++) {
			words[i] = input.next();
		}
		
		String play = " ";
		
		do {
			
			playHangman(words);
			
			System.out.print("Do you want to guess another word? Enter y/n: ");
			play = input.next();
			
		} while (play.equals("y"));

	}

	private static void playHangman(String[] words) {
		Scanner input = new Scanner(System.in);
		
		int index = (int)(Math.random() * words.length);
		char[] answer = words[index].toCharArray();
		char[] result = new char[words[index].length()];
		for (int i = 0; i < result.length; i++) {
			result[i] = '*';
		}
		int missCount = 0;
		while(!Arrays.equals(result, answer)) {
			System.out.print("(Guess) Enter a letter in word ");
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i]);
			}
			System.out.print(" > ");
			
			char ch = input.nextLine().charAt(0);
			
			boolean inAnswer = false;
			
			for (int i = 0; i < result.length; i++) {
				if (ch == answer[i]) {
					inAnswer = true;
					if (result[i] == '*') {
						result[i] = ch;
						continue;
					}
					if (result[i] == ch) {
						System.out.println(ch + " is already in the word.");
						continue;
					}
				}
				
			
			}
			
			if (!inAnswer) {
				System.out.println(ch + " is not in the word.");
				missCount++;
			}
			
		}
		
		System.out.println("The word is " + words[index]);
		System.out.println("You missed " + missCount + " times.");
	}



}
