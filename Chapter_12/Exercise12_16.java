package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_16 {

	public static void main(String[] args) throws Exception {
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Enter file name: ");
		File sourceFile = new File(inputUser.next());

		if (!sourceFile.exists()) {
			System.out.println("Source file does not exist");
			System.exit(0);
		}

		System.out.println("Enter old string:");
		String oldStr = inputUser.nextLine();
		inputUser.nextLine();
		System.out.println("Enter new string: ");
		String newStr = inputUser.nextLine();

		ArrayList<String> list = new ArrayList<>();

		try (Scanner input = new Scanner(sourceFile)) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(oldStr, newStr);
				list.add(s2);
			}
		}
		
		try (PrintWriter output = new PrintWriter(sourceFile)) {
			for (int i = 0; i < list.size(); i++) {
				output.println(list.get(i));
			}
		}

	}

}
