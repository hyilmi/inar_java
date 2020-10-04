package chapter9;

public class Exercise09_02 {

	public static void main(String[] args) {
		Stock s = new Stock("ORCL", "Oracle Corporation");
		s.previousClosingPrice = 34.5;
		s.currentPrice = 34.35;
		
		System.out.println("Change in price: " + s.getChangePercentage(s.previousClosingPrice, s.currentPrice));
	}

}

class Stock{
	
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String s1, String s2){
		symbol = s1;
		name = s2;
	}
	
	String getChangePercentage(double price1, double price2) {
		double diff = price2 - price1;
		double percentage = (100*diff)/price1;
		
		if (diff > 0) {
			return "+%" + percentage;
		}else {
			return "-%" + (-percentage); 
		}
	}
	
}
