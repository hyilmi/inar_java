package chapter9;

public class Exercise09_06 {

	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();
		
		int[] arr = new int[100_000];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100000);
		}
		
		timer.start();
		
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int minIndex = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		
		timer.stop();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%7d", arr[i]);
			if ((i+1) % 100 == 0) {
				System.out.println("");
			}
		}
		System.out.println("Elapsed time: " + timer.elapsedTime() + " milliseconds");

	}

}

class Stopwatch{
	long startTime;
	long endTime;
	
	Stopwatch(){
		startTime = System.currentTimeMillis();
	}
	
	void start(){
		startTime = System.currentTimeMillis();
	}
	
	void stop() {
		endTime = System.currentTimeMillis();
	}
	
	long elapsedTime() {
		return endTime - startTime;
	}
	
}