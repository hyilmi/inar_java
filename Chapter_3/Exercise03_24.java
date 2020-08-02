package chapter3;
import java.util.Scanner;

public class Exercise03_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int card = (int)(Math.random()*13) + 1;
		int suit = (int)(Math.random()*4);
		
		System.out.print("The card you picked is ");
		
		switch(card) {
		case 1: System.out.print("Ace");break;
		case 2: System.out.print(card);break;
		case 3: System.out.print(card);break;
		case 4: System.out.print(card);break;
		case 5: System.out.print(card);break;
		case 6: System.out.print(card);break;
		case 7: System.out.print(card);break;
		case 8: System.out.print(card);break;
		case 9: System.out.print(card);break;
		case 10: System.out.print(card);break;
		case 11: System.out.print("Jack");break;
		case 12: System.out.print("Queen");break;
		case 13: System.out.print("King");break;
		}
		System.out.print(" of ");
		
		switch(suit) {
		case 0: System.out.print("Clubs");break;
		case 1: System.out.print("Diamonds");break;
		case 2: System.out.print("Hearts");break;
		case 3: System.out.print("Spades");break;
		}
		
		
		

	}

}
