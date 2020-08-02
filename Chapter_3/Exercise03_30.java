package chapter3;

import java.util.Scanner;

public class Exercise03_30 {

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
		long currentTime = currentHour + offset;
		
		if (currentTime > 12) {
			System.out.println("Current time: " + ((currentTime) % 12) + ":" + currentMinute + ":" + currentSecond + " PM");
		}else {
			System.out.println("Current time: " + (currentTime) + ":" + currentMinute + ":" + currentSecond + " AM");

		}
	
		
	}

}
