package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> factors = new ArrayList<Integer>();
		ArrayList<Integer> allFactors = new ArrayList<Integer>();

		System.out.println("Enter an integer m: ");
		Integer m = input.nextInt();

		for (int i = 2; i < m; i++) {

			if (m % i == 0 && isPrime(i)) {
				factors.add(i);
			}
		}
		
		int x = m; //copy m to x
		
		for (int i = 0; i < factors.size(); i++) {
			while(x % factors.get(i) == 0) {
				x /= factors.get(i);
				allFactors.add(factors.get(i));
			}
		}
		System.out.print("All factors of " + m + " are ");
		for (Integer integer : allFactors) {
			System.out.print(integer + " ");
		}
		System.out.println();
		
		int n = 1;
		
		for (int i = 0; i < factors.size(); i++) {
			int count = 0;
			for (int j = 0; j < allFactors.size(); j++) {
				if (allFactors.get(i).compareTo(allFactors.get(j)) == 0) {
					count++;
				}
			}
			
			if (count % 2 != 0) {
				System.out.print(allFactors.get(i) + " ");
				n *= allFactors.get(i);
			}
		}
		
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		System.out.println("m * n is " + (m * n));
		
		
		

	}

	private static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
