package chapter10;

import java.util.GregorianCalendar;

public class Exercise10_14 {

	public static void main(String[] args) {
		MyDate x = new MyDate(System.currentTimeMillis());
		MyDate y = new MyDate(34355555133101L);
		
		System.out.println(x.getDay() + "/" + x.getMonth() + "/" + x.getYear());
		System.out.println(y.getDay() + "/" + y.getMonth() + "/" + y.getYear());

	}

}

class MyDate{
	private long day;
	private long month; //0-jan , 11-dec
	private long year;
	
	public MyDate(){
		java.util.Date date = new java.util.Date();
		this.day = date.getDay();
		this.month = date.getMonth();
		this.year = date.getYear();
	}
	
	public MyDate(long elapsedTime) {
		setDate(elapsedTime);
		
	}
	
	public void setDate(long elapsedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.year = calendar.get(GregorianCalendar.YEAR);
		
	}

	public long getDay() {
		return day;
	}

	public long getMonth() {
		return month;
	}

	public long getYear() {
		return year;
	}
	
	
}
