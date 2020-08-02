package chapter3;
import java.util.Scanner;

public class Exercise03_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x and y coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean inTriangle = x/2 + y <= 100;
		
		if(inTriangle) {
			System.out.println("The point is in the triangle.");
		}else {
			System.out.println("The point is not in the triangle.");
		}
	}

}
