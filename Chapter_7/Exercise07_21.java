package chapter7;

import java.util.Scanner;

public class Exercise07_21 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();
		
		System.out.print("Enter the number of slots in the bean machine: ");
		int numberOfSlots = input.nextInt();
		
		int[] slots = new int[numberOfSlots];
		
		for (int i = 0; i < numberOfBalls; i++) {
			String path = "";
			int right = 0;
			
			for (int j = 0; j < slots.length - 1; j++) {
				int leftOrRight = (int)(Math.random() * 2) + 1;
				
				if (leftOrRight == 1) {
					path += 'L';
				}else {
					path += 'R';
					right++;
				}
			}
			
			slots[right]++;
			System.out.println(path);
			
		}
		int maxNumberOfBalls = numberOfBalls;
		for (int i = 0; i < numberOfBalls; i++) {
			for (int j = 0; j < slots.length; j++) {
				if (slots[j] >= maxNumberOfBalls) {
					System.out.print("0");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
			maxNumberOfBalls--;
			
		}
		
		
		
		
		
		
		
	}

}
