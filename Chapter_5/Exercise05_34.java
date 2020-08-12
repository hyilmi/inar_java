package chapter5;

import java.util.Scanner;

public class Exercise05_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int playerWins = 0;
		int computerWins = 0;
		
		while(playerWins <= 2 && computerWins <= 2) {
		
			System.out.println("scissors (0), rock(1), paper(2): ");
			int choice = input.nextInt();
			
			int computer = (int)(Math.random() * 3);
			
			switch(choice) {
			case 0: System.out.print("You chose scissors, ");break;
			case 1: System.out.print("You chose rock, ");break;
			case 2: System.out.print("You chose paper, ");break;
			}
			switch(computer) {
			case 0: System.out.print("the computer chose scissors. ");break;
			case 1: System.out.print("the computer chose rock. ");break;
			case 2: System.out.print("the computer chose paper. ");break;
			}
			
			if((choice == 0 && computer == 2) || (choice == 1 && computer == 0) || (choice == 2 && computer == 1)) {
				System.out.print("You won!\n");
				playerWins++;
				
			}else if(choice == computer){
				System.out.print("Its a draw!\n");
			}else {
				System.out.print("You lost!\n");
				computerWins++;
			}

		}
		if(playerWins >= computerWins) {
			System.out.println("You won the game!");
		}else if (playerWins == computerWins) {
			System.out.println("Its a draw!");
		}else {
			System.out.println("You lost the game!");
		}
		
	}

	}


