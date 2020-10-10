package chapter11;

import java.util.ArrayList;
import chapter11.Transactions;

public class Account2 {

	private String name;
	private int id;
	private double balance;
	private ArrayList<Transactions> transactions;
	private double annualInterestRate;
	
	public Account2(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
		transactions = new ArrayList<Transactions>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public ArrayList<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transactions> transactions) {
		this.transactions = transactions;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void withdraw(double amount) {
		balance -= amount;
		transactions.add(new Transactions('W', amount, balance, "Withdrawal"));
	}
	
	public void deposit(double amount) {
		balance += amount;
		Transactions d = new Transactions('D', amount, balance, "Deposit");
		transactions.add(d);
	}
	
}

	

