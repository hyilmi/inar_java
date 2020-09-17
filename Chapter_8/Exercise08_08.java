package chapter8;

import java.util.Scanner;

public class Exercise08_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of points: ");
		int size = input.nextInt();

		System.out.println("Enter " + size + " points: ");

		double[][] m = new double[size][2];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		//find the closest distance between two points
		double closestDistance = Double.MAX_VALUE;
		int p1Index = 0;
		int p2Index = 0;

		for (int i = 0; i < m.length - 1; i++) {
			for (int j = i + 1; j < m.length; j++) {
				double distance = findDistance(m[i][0], m[i][1], m[j][0], m[j][1]);
				if (distance < closestDistance) {
					closestDistance = distance;
					p1Index = i;
					p2Index = j;
				}
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				double distance = findDistance(m[i][0], m[i][1], m[j][0], m[j][1]);
				if (distance == closestDistance) {
					System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n", m[i][0], m[i][1], m[j][0], m[j][1]);
				}
			}
		}
		
		System.out.println("Their distance is " + closestDistance);

	}

	public static double findDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}
