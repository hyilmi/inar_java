package chapter5;
import java.util.Scanner;

public class Exercise05_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int num = input.nextInt();
		int positives = 0;
		int negatives = 0;
		double total = 0;
		while(num != 0) {
			if (num > 0) {
				positives++;
			}else {
				negatives++;
			}																									
			total += num;
			num = input.nextInt();
		}
		if (positives == 0 && negatives == 0 && total == 0) {
			System.out.println("No numbers entered except 0");
			System.exit(0);
		}
		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is " + total);
		System.out.println("The average is " + total / (positives + negatives));
	}

}
