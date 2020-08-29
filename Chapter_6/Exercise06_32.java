package chapter6;

public class Exercise06_32 {

	public static void main(String[] args) {
		int wins = 0;
		int losses = 0;
		while(wins + losses < 10000) {
			if(playCraps()) {
				wins++;
			}else {
				losses++;
			}
		}
		System.out.printf("Wins: %d | Losses: %d", wins, losses);
		
	
	}
	private static boolean playCraps() {
		int sum = 0;
		int point = 1;
		int die1 = rollDie();
		int die2 = rollDie();
		sum = die1 + die2;
		System.out.printf("You rolled %d + %d = %d\n", die1, die2, sum);

		switch (sum) {
		case 2:
		case 3:
		case 12:
			System.out.println("You lose!");
			return false;
		case 7:
		case 11:
			System.out.println("You win!");
			return true;
		case 4:
		case 5:
		case 6:
		case 8:
		case 9:
		case 10:
			point = sum;
			System.out.printf("The point is %d\n", point);
			int sum2 = 0;
			while(sum2 != 7 && sum2 != point) {
				die1 = rollDie();
				die2 = rollDie();
				sum2 = die1 + die2;
				System.out.printf("You rolled %d + %d = %d\n", die1, die2, sum2);
				if(sum2 == 7) {
					System.out.println("You lose!");
					return false;
				}
				if(sum2 == point) {
					System.out.println("You win!");
					return true;
				}
			}

		}

		
		return false;
	}
	public static int rollDie() {
		return (int)(Math.random() * 6 + 1) ;
	}


}
