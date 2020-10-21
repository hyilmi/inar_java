package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_13 {

	public static void main(String[] args) throws IOException {
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Enter file name: ");
		File f = new File(inputUser.next());

		int chars = 0;
		int words = 0;
		int lines = 0;

		try (Scanner input = new Scanner(f); Scanner input2 = new Scanner(f)) {
			while (input.hasNext()) {
				String line = input.nextLine();
				lines++;
			}
			while (input2.hasNext()) {
				String word = input2.next();
				words++;
				chars += word.length();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Characters: " + chars);
		System.out.println("Words: " + words);
		System.out.println("Lines: " + lines);

	}

}
