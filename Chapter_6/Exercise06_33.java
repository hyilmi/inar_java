package chapter6;

public class Exercise06_33 {

	public static void main(String[] args) throws InterruptedException {
			long milliseconds = System.currentTimeMillis();
			int seconds = (int)(milliseconds / 1000) % 60;
			int minutes = (int)(milliseconds / (1000 * 60)) % 60;
			int hours = (int)(milliseconds / (1000 * 60 * 60)) % 24;
			int days = (int)(milliseconds / (1000 * 60 * 60 * 24));
			
			System.out.printf("%d %d:%d:%d\n", days, hours, minutes, seconds);
			Thread.sleep(1000);

	}

}
