package chapter5;

public class Exercise05_26 {

	public static void main(String[] args) {
		//calculate for i = 10000
		double e1 = 1;
		for (double i = 1; i <= 10000 ;i++) {
			double fact = 1;
			for(double j = 1; j <= i; j++) {
				fact = fact * j;
			}
			e1 = e1 + 1/fact;
			
		}
		System.out.println(e1);
		
		//calculate for i = 20000
		double e2 = 1;
		for (double i = 1; i <= 20000 ;i++) {
			double fact = 1;
			for(double j = 1; j <= i; j++) {
				fact = fact * j;
			}
			e2 = e2 + 1/fact;
			
		}
		System.out.println(e2);
		
		//calculate for i = 100000
		double e3 = 1;
		for (double i = 1; i <= 100000 ;i++) {
			double fact = 1;
			for(double j = 1; j <= i; j++) {
				fact = fact * j;
			}
			e3 = e3 + 1/fact;
			
		}
		System.out.println(e3);

	}
	

}
