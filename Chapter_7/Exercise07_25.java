package chapter7;

import java.util.Scanner;

public class Exercise07_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The quadratic formula: ax^2 + bx + c");
		System.out.println("Enter a, b and c: ");
		
		double[] eqn = new double[3];
		double[] roots = new double[2];
		
		for (int i = 0; i < eqn.length; i++) {
			eqn[i] = input.nextDouble();
		}
		int numberOfRoots = solveQuadratic(eqn, roots);
		
		System.out.println("Number of roots: " + numberOfRoots);
		System.out.println("Root 1: " + roots[0]);
		System.out.println("Root 2: " + roots[1]);
		

	}
	public static int solveQuadratic(double[] eqn, double[] roots) {
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		
		double delta = Math.pow(b*b - 4*a*c, 0.5);
		roots[0] = (-b + delta) / (2*a);
		roots[1] = (b - delta) / (2*a);
		
		if(delta > 0) {
			return 2;
		}else if(delta == 0) {
			return 1;
		}else {
			return 0;
		}
		
	}

}
