package chapter7;

public class Exercise07_02 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		System.out.println("Original: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * (100 + 1));
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\nReversed: ");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[numbers.length - (i + 1)] + " ");
		}

	}

}
