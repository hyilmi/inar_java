package chapter9;

import java.util.Scanner;

public class Exercise09_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a,b,c,d,e,f: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);
		
		if (!le.isSolvable()) {
			System.out.println("The equation has no solution.");
		}
		
	}

}

class LinearEquation{
	private double a,b,c,d,e,f;
	
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		return a*d - b*c != 0;
	}
	
	public double getX() {
		return (e*d - b*f) / (a*d - b*c);
	}
	
	public double getY() {
		return (a*f - e*c) / (a*d - b*c);
	}
}
