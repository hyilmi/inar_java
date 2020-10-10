package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise11_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter a list of integers (enter 0 to end): ");
		Integer n = input.nextInt();
		while(n != 0) {
			list.add(n);
			n = input.nextInt();
		}
		
		System.out.println("List size: " + list.size());
		
		System.out.println("Original list: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		Collections.shuffle(list);
		
		System.out.println("Shuffled list: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
