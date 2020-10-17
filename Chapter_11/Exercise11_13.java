package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> distinctNumbers = new ArrayList<Integer>();
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			Integer n = input.nextInt();
			list.add(n);
		}
		
		for (Integer integer : list) {
			if (!distinctNumbers.contains(integer)) {
				distinctNumbers.add(integer);
			}
		}
		
		System.out.print("The distinct integers are ");
		
		for (Integer integer : distinctNumbers) {
			System.out.print(integer + " ");
		}

	}

}
