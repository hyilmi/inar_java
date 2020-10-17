package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		System.out.println("Enter 5 numbers for list 1: ");
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}

		System.out.println("Enter 5 numbers for list 2: ");
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}

		System.out.print("The combined list is ");

		ArrayList<Integer> union = union(list1, list2);

		for (Integer integer : union) {
			System.out.print(integer + " ");
		}

	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> result = list1;

		for (Integer integer : list2) {
			result.add(integer);
		}

		return result;
	}

}
