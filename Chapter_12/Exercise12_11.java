package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_11 {

	public static void main(String[] args) throws Exception {
		Scanner inputUser = new Scanner(System.in);
		
		System.out.println("Enter file name: ");
		File file = new File(inputUser.next());
		
		System.out.println("Enter word to filter out: ");
		String word = inputUser.next();
		
		ArrayList<String> list = new ArrayList<>(); 
		try (
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(word, "");
				list.add(s2);
			}
		}
		
		try(PrintWriter output = new PrintWriter(file)){
			for (int i = 0; i < list.size(); i++) {
				output.println(list.get(i));
			}
			
		}
	}
}
