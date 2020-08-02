package chapter4;

import java.util.Scanner;

public class Exercise04_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();

		String temp;

		int compare1_2 = city1.compareToIgnoreCase(city2);
		if (compare1_2 > 0) {
			temp = city1;
			city1 = city2;
			city2 = temp;
		}
		int compare1_3 = city1.compareToIgnoreCase(city3);
		if (compare1_3 > 0) {
			temp = city1;
			city1 = city3;
			city3 = temp;
		}

		int compare2_3 = city2.compareToIgnoreCase(city3);
		if (compare2_3 > 0) {
			temp = city2;
			city2 = city3;
			city3 = temp;
		}
		System.out.println("The three cities in alpabetical order are " + city1 + " " + city2 + " " + city3);

	}

}
