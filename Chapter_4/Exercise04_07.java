package chapter4;

import java.util.Scanner;

public class Exercise04_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the bounding circle: ");
		double r = input.nextDouble();
		
		double x1 = 0;
		double y1 = r;
		double x2 = r * Math.cos(72);
		double y2 = r * Math.sin(72);
		double x3 = r * Math.cos(72*2);
		double y3 = r * Math.sin(72*2);
		double x4 = r * Math.cos(72*3);
		double y4 = r * Math.sin(72*3);
		double x5 = r * Math.cos(72*4);
		double y5 = r * Math.sin(72*4);
		
		System.out.println(x2);
		System.out.println(y2);
		System.out.println(x3);
		System.out.println(y3);
		
		
		
	}

}
