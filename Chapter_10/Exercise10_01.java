package chapter10;

import java.util.Date;

public class Exercise10_01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(5555500000l);
		
		System.out.printf("%d:%d:%d\n", t1.getHour(), t1.getMinute(), t1.getSecond());
		System.out.printf("%d:%d:%d\n", t2.getHour(), t2.getMinute(), t2.getSecond());

	}

}

class Time {
	private long hour;
	private long minute;
	private long second;
	
	Time() {
		long milliseconds = System.currentTimeMillis();
		int s = (int)(milliseconds / 1000);
		this.second = s % 60;
		this.minute = (s / 60) % 60;
		this.hour = (s / (60 * 60)) % 24;
	}
	
	Time(long milliseconds){
		long s = (milliseconds / 1000);
		this.second = s % 60;
		this.minute = (s / 60) % 60;
		this.hour = (s / (60 * 60)) % 24;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}
	
	public void setTime(long elapsedTime) {
		long totalSeconds = elapsedTime / 1000;
		long seconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long minutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long hour = totalHours % 24;
	}
	
}