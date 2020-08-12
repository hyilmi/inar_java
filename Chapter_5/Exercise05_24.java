package chapter5;

public class Exercise05_24 {

	public static void main(String[] args) {
		double total = 0;
		for(double i = 1; i <= 97; i+=2) {
			total += i/(i+2);
		}
		System.out.println("1/3 + 3/5 + 5/7 + ... + 97/99 = " + total);
		
	}

}
