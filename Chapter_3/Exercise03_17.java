package chapter3;

import java.util.Scanner;

public class Exercise03_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
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
			System.out.print("You win!");
		}else if(choice == computer){
			System.out.print("Its a draw!");
		}else {
			System.out.print("You lose!");
		}

	}

}
