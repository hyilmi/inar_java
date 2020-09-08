package chapter7;

import java.util.Scanner;

public class Exercise07_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter list 1: ");
		int size1 = input.nextInt();
		int[] list1 = new int[size1];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.println("Enter list 2: ");
		int size2 = input.nextInt();
		int[] list2 = new int[size2];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		
		int[] mergedList = new int[size1 + size2];
		for (int i = 0; i < size1; i++) {
			mergedList[i] = list1[i];
		}
		for (int i = 0; i < size2; i++) {
			mergedList[size1 + i] = list2[i];
		}
		
		mergedList = sort(mergedList);
		
		System.out.print("The merged list is ");
		for (int i = 0; i < mergedList.length; i++) {
			System.out.print(mergedList[i] + " ");
		}

	}
	
	public static int[] sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		
		return array;
	}

}
