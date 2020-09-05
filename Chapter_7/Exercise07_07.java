package chapter7;

public class Exercise07_07 {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 10);
			System.out.print(numbers[i] + " ");
			if ((i + 1) % 20 == 0) {
				System.out.println("");
			}
		}
		
		int[] counts = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			counts[numbers[i]]++;
		}
		
		for (int i = 0; i < counts.length; i++) {
			System.out.print(i + ":" + counts[i] + "\n");
		}

	}

}
