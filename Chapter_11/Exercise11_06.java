package chapter11;

import java.util.ArrayList;

public class Exercise11_06 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		
		Circle c = new Circle(3);
		java.util.Date d = new java.util.Date();
		Loan l = new Loan(5000, 3, 1);
		String s = "howdy";
		
		list.add(c);
		list.add(d);
		list.add(l);
		list.add(s);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}

}

class Circle{
	private double radius = 1;
	
	Circle(){
		
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public String toString() {
		return "Radius: " + this.radius + " Perimeter: " + getPerimeter() + " Area: " + getArea();
	}
}

class Loan{
	private double loanAmount;
	private int years;
	private double annualInterestRate;
	
	Loan() {
		
	}
	
	Loan(double loanAmount, int years, double annualInterestRate){
		this.loanAmount = loanAmount;
		this.years = years;
		this.annualInterestRate = annualInterestRate;
		
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public String toString() {
		return "Loan amount: " + loanAmount + " Duration: " + years + " years Annual interest rate: %" + annualInterestRate; 
	}
	
}


