package chapter10;

import java.util.Scanner;

import chapter11.Account;

public class Exercise10_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100, 0);
		}

		while (true) {

			System.out.print("Enter an id: ");
			int id = input.nextInt();

			while (true) {

				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				System.out.print("Enter a choice: ");
				int choice = input.nextInt();

				switch (choice) {
				case 1:
					System.out.println("The balance is " + accounts[id].getBalance());
					break;
				case 2:
					System.out.print("Enter an amount to withdraw: ");
					double wdAmount = input.nextDouble();
					accounts[id].withdraw(wdAmount);
					break;
				case 3:
					System.out.print("Enter an amount to deposit: ");
					double dpAmount = input.nextDouble();
					accounts[id].deposit(dpAmount);
					break;
				case 4:
					break;
				}
				
				if (choice == 4) {
					break;
				}

			}
		}
	}

}
