package chapter10;

import java.math.BigDecimal;

public class Exercise10_20 {

	public static void main(String[] args) {
		BigDecimal e = new BigDecimal(1 + "");
		
		for (int i = 100; i <= 1000; i += 100) {
			int n = 1;
			for (int j = 1; j <= i; j++) {
				n *= j;
				e.add(new BigDecimal(1/n + ""));
				
			}
			
			System.out.println(e);
		}

	}

}
