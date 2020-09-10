package chapter7;

public class Exercise07_29 {

	public static void main(String[] args) {
		int[] deck = new int[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i + 1;
		}
		
		int sum;
		int[] picks;
		
		do {
			sum = 0;
			picks = new int[4];
			
			for (int i = 0; i < picks.length; i++) {
				int index = (int)(Math.random() * 52);
				int cardValue = deck[index] % 13 + 1;
				picks[i] = cardValue;
				sum += cardValue;
			}
			
		} while (sum != 24);
		
		System.out.print("The number of picks that yields the sum of 24: ");
		
		for (int i = 0; i < picks.length; i++) {
			if(picks[i] == 11) {
				System.out.print("Jack ");
			}else if(picks[i] == 12) {
				System.out.print("Queen ");
			}else if(picks[i] == 13) {
				System.out.print("King ");
			}else {
				System.out.print(picks[i] + " ");
			}
		}
		
		
	}

}
