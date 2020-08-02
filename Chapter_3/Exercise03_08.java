package chapter3;

import java.util.Scanner;

public class Exercise03_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 integers: ");
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int int3 = input.nextInt();
		
		if ((int1 > int2) && (int1 > int3)) {
			if (int2 > int3) {
				System.out.println(int1 + " " + int2 + " " + int3);
							
			}else {
				System.out.println(int1 + " " + int3 + " " + int2);
			}
		}
		
		if ((int2 > int1) && (int2 > int3)) {
			if (int1 > int3) {
				System.out.println(int2 + " " + int1 + " " + int3);
				
			}else {
				System.out.println(int2 + " " + int3 + " " + int1);
			}
		}
		if ((int3 > int1) && (int3 > int2)) {
			if (int1 > int2) {
				System.out.println(int3 + " " + int1 + " " + int2);
				
			}else {
				System.out.println(int3 + " " + int2 + " " + int1);
			}
		}
	}
	

}
