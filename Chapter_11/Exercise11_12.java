package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			Integer n = input.nextInt();
			list.add(n);
		}
		
		int sum = 0;
		for (Integer integer : list) {
			sum += integer;
		}
		
		System.out.println(sum);

	}

}
