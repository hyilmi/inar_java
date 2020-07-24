package chapter2;
import java.util.Scanner;

public class Exercise02_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weightLbs = input.nextDouble();
		
		System.out.println("Enter height in inches: ");
		double heightInch = input.nextDouble();
		
		double weightKg = weightLbs * 0.45359237;
		double heightM = heightInch * 0.0254;
		
		double BMI = weightKg / (heightM * heightM);
				
		System.out.println("Your BMI is " + BMI);

	}

}
