package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_13 {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Enter file name: ");
		File f = new File(inputUser.next());

		int chars = 0;
		int words = 0;
		int lines = 0;

		try (Scanner input = new Scanner(f)) {
			while (input.hasNext()) {
				chars++;
			}
			while (input.hasNextLine()) {
				lines++;
			}
			while (input.hasNext()) {
				String word = input.next();
				words++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Characters: " + chars);
		System.out.println("Words: " + words);
		System.out.println("Lines: " + lines);

	}

}
