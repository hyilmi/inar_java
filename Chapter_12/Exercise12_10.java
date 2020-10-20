package chapter12;

public class Exercise12_10 {

	public static void main(String[] args) {
		int size = 1000000000;
		
		try {
			int[] arr = new int[size];
			
		} catch (OutOfMemoryError e) {
			System.out.println("out of memory");
		}

	}

}
