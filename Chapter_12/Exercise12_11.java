package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_11 {

	public static void main(String[] args) throws Exception {
		Scanner inputUser = new Scanner(System.in);
		
		System.out.println("Enter file name: ");
		File file = new File(inputUser.next());
		
		System.out.println("Enter word to filter out: ");
		String word = inputUser.next();
		
		try(
				Scanner input = new Scanner(file);
				PrintWriter output = new PrintWriter(file);
		) {
				while(input.hasNext()) {
					String s = input.next();
					if (word.matches(s)) {
						
					}
				}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
