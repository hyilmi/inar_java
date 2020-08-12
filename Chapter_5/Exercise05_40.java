package chapter5;

public class Exercise05_40 {

	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		
		for (int i = 0; i < 1_000_000; i++) {
			int headsOrTails = (int)(Math.random() * 2) + 1;
			if(headsOrTails == 1) {
				heads++;
			}else {
				tails++;
			}
		}
		System.out.println("Heads: " + heads);
		System.out.println("Tails: " + tails);

	}

}
