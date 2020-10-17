package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n1 = (int)(Math.random() * 20) + 1;
		int n2 = (int)(Math.random() * 20) + 1;
		int result = n1 + n2;
		boolean incorrect = true;
		System.out.println("What is " + n1 + " + " + n2 + "?");
		
		while(incorrect) {
			Integer answer = input.nextInt();
			
			if(list.contains(answer)) {
				System.out.println("You already entered " + answer);
				System.out.print("Wrong answer. Try again. ");
				System.out.println("What is " + n1 + " + " + n2 + "?");
				
			}else if (answer != result) {
				list.add(answer);
				System.out.print("Wrong answer. Try again. ");
				System.out.println("What is " + n1 + " + " + n2 + "?");
			}else {
				System.out.println("You got it!");
				incorrect = false;
			}
		}
		
		

	}

}
