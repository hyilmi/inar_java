package chapter4;

import java.util.Scanner;

public class Exercise04_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN-10 number: ");
		String codeString = input.nextLine();
		int code = Integer.parseInt(codeString);
		
		int d9 = code % 10;
		int d8 = (code / 10) % 10;
		int d7 = (code / 100) % 10;
		int d6 = (code / 1000) % 10;
		int d5 = (code / 10000) % 10;
		int d4 = (code / 100000) % 10;
		int d3 = (code / 1000000) % 10;
		int d2 = (code / 10000000) % 10;
		int d1 = (code / 100000000) % 10;
		
		int d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
		if (d10 > 9) {
			System.out.println("ISBN: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X"); 
		}else {
			System.out.println("ISBN: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);

	}

	}
}