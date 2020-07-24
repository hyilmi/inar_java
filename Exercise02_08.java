package chapter2;
import java.util.Scanner;

public class Exercise02_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long milliseconds = System.currentTimeMillis();
		
		long seconds = milliseconds / 1000;
		long currentSecond = seconds % 60;
		
		long minutes = seconds / 60;
		long currentMinute = minutes % 60;
		
		long hours = minutes / 60;
		long currentHour = hours % 24;
		
		System.out.println("Enter time zone offset to GMT: ");
		long offset = input.nextLong();
	
		System.out.println("Current time: " + (currentHour + offset) + ":" + currentMinute + ":" + currentSecond);

	}

}
