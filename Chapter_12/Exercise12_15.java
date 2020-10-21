package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise12_15 {

	public static void main(String[] args) throws IOException {
		File file = new File("src/test3.txt");

		if (file.exists()) {
			System.out.println("File already exists.");
			System.exit(0);
		} else {
			file.createNewFile();
		}

		try (PrintWriter output = new PrintWriter(file)) {
			for (int i = 0; i < 100; i++) {
				int num = (int) (Math.random() * 1001);
				output.print(num + " ");
			}
		}

		int[] result = new int[100];

		try {
			Scanner input = new Scanner(file);
			int i = 0;
			while (input.hasNext()) {
				result[i] = input.nextInt();
				i++;
			}

		} catch (FileNotFoundException e) {

		}

		Arrays.sort(result);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
		}

	}

}
