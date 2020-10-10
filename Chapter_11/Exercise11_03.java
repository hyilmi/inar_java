package chapter11;

import java.util.Date;

public class Exercise11_03 {

	public static void main(String[] args) {
		Account a1 = new Account(312321, 6000, 1);
		CheckingAccount ca = new CheckingAccount(321322, 300, 0, -50);
		SavingsAccount sa = new SavingsAccount(321323, 10000, 1);
		
		System.out.println(a1.toString());
		System.out.println(ca.toString());
		System.out.println(sa.toString());
	}

}

class CheckingAccount extends Account{
	private double overdraftLimit;
	
	CheckingAccount(){
		super();
	}
	
	CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit){
		super(id, balance, annualInterestRate);	
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double amount) {
		double balance = getBalance();
		if (balance - amount > overdraftLimit) {
			setBalance(balance - amount);
		}
		else
			System.out.println("Cannot withdraw this amount.");
		
	}
	
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
}

class SavingsAccount extends Account{
	
	SavingsAccount(){
		super();
	}
	
	SavingsAccount(int id, double balance, double annualInterestRate){
		super(id, balance, annualInterestRate);
		
	}
	
	public void withdraw(double amount) {
		if (getBalance() - amount < 0) {
			System.out.println("Cannot withdraw this amount.");
		}else {
			setBalance(getBalance() - amount);
		}
	}
	
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
	
	
}




















