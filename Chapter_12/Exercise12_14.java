package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_14 {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Enter file name: ");
		File file = new File(inputUser.next());

		if (!file.exists()) {
			System.out.println("File does not exist.");
			System.exit(0);
		}
		
		int count = 0;
		int sum = 0;

		try (Scanner input = new Scanner(file)

		) {
			while(input.hasNext()) {
				sum += input.nextInt();
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Score total: " + sum);
		System.out.println("Score average: " + (sum/count));

	}

}
