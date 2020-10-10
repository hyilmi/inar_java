package chapter11;

public class Exercise11_08 {

	public static void main(String[] args) {
		Account2 newAccount = new Account2("George", 1122, 1000);
		
		newAccount.setAnnualInterestRate(1.5);
		
		newAccount.withdraw(5);
		newAccount.withdraw(4);
		newAccount.withdraw(2);
		
		newAccount.deposit(30);
		newAccount.deposit(40);
		newAccount.deposit(50);
		
		
		System.out.println("Account holder: " + newAccount.getName());
		System.out.println("Interest rate: " + newAccount.getAnnualInterestRate());
		System.out.println("Balance: " + newAccount.getBalance());
		System.out.println("--------------------------------------------------");

		
		for (int i = 0; i < newAccount.getTransactions().size(); i++) {
			System.out.println("Type: " + newAccount.getTransactions().get(i).getType());
			System.out.println("Amount: " + newAccount.getTransactions().get(i).getAmount());
			System.out.println("Balance: " + newAccount.getTransactions().get(i).getBalance());
			System.out.println("Description: " + newAccount.getTransactions().get(i).getDescription());
			System.out.println("--------------------------------------------------");

		}
	}

}
