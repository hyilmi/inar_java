package chapter3;
import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double deltaSquared = b*b - 4*a*c;
		double delta = Math.pow(deltaSquared, 0.5);
		
		double root1 = (-b + delta) / (2*a);
		double root2 = (b - delta) / (2*a);
		
		if (delta > 0) {
			System.out.println("The equation has 2 roots; " + 
		root1 + " and " + root2);
			
		}else if (delta == 0) {
			System.out.println("The equation has 1 root: " + root1); //how do we know which root to print?
		}else
			System.out.println("The equation has no real roots.");
	}

}
