package chapter8;

import java.util.Scanner;

public class Exercise08_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of cities: ");
		int size = input.nextInt();

		System.out.println("Enter " + size + " coordinates: ");

		double[][] m = new double[size][2];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		double shortestTotalDistance = Double.MAX_VALUE;
		double totalDistance = 0;
		int cityIndex = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				double distance = findDistance(m[i][0], m[i][1], m[j][0], m[j][1]);
				totalDistance += distance;
			}
			if (totalDistance < shortestTotalDistance) {
				shortestTotalDistance = totalDistance;
				cityIndex = i;
			}
		}
		
		System.out.printf("The central city is at (%.1f, %.1f)\n", m[cityIndex][0], m[cityIndex][1]);
		System.out.printf("The total distance to all other cities is %.2f", shortestTotalDistance);
		
		
		
	}
	public static double findDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}

}
