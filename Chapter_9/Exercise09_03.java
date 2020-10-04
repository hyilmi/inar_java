package chapter9;

import java.util.Date;

public class Exercise09_03 {

	public static void main(String[] args) {
		Date date = new Date();
		
		for (int i = 0; i < 8; i++) {
			long time = (long)Math.pow(10, 4+i);
			date.setTime(time);
			System.out.println(time + " milliseconds: " + date.toString());
		}

	}

}
