package chapter7;

import java.util.Scanner;

public class Exercise07_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values (first value determines the size of the list): ");
		int size = input.nextInt();
		int[] list = new int[size];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		
		int pivot = list[0];
		
		int underPivot = 0;
		int overPivot = 0;
		
		for (int i = 1; i < list.length; i++) {
			if (list[i] < pivot) {
				underPivot++;
			}else {
				overPivot++;
			}
		}
		
		int[] partitionedList = new int[size];
		partitionedList[underPivot] = pivot;
		
		for (int i = 0; i < underPivot; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[j] < pivot) {
					partitionedList[i] = list[j];
				}
			}
		}
		
		for (int i = underPivot + 1; i < partitionedList.length; i++) {
			for (int j = 0; j < partitionedList.length; j++) {
				if (list[j] >= pivot) {
					partitionedList[i] = list[j];
				}
			}
		}
		System.out.print("The partitioned list: ");
		for (int i = 0; i < partitionedList.length; i++) {
			System.out.print(partitionedList[i] + " ");
		}

	}

}
