package chapter9;

import java.util.Date;

public class Exercise09_07 {

	public static void main(String[] args) {
		Account x = new Account(1122, 20000, 4.5);
		
		x.withdraw(2500);
		x.deposit(3000);
		
		System.out.printf("Balance: $%.2f\n", x.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", x.getMonthlyInterest());
		System.out.println("Date created: " + x.getDate());
	}

}

class Account{
	private int id = 0;
	private double balance = 0;
	static private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	Account(){
		
	}
	
	Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		Account.annualInterestRate = annualInterestRate; //cuz its static yo
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	
	public Date getDate() {
		return dateCreated;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	double getMonthlyInterest() {
		return (annualInterestRate / (12 * 100)) * balance;
	}
	
	void withdraw(double withdrawalAmount) {
		balance -= withdrawalAmount;
	}
	
	void deposit(double depositAmount) {
		balance += depositAmount;
	}
	
}
