package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter integers: ");
		
		ArrayList<Integer> integers = new ArrayList<>();
		Integer i = input.nextInt();
		
		while(i != 0) {
			integers.add(i);
			i = input.nextInt();
		}
		
		System.out.println("Max: " + max(integers));
		
	}
	
	public static Integer max(ArrayList<Integer> list) {
		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;
	}

}


