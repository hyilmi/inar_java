package chapter8;

import java.util.Scanner;

public class Exercise08_07 {

	public static void main(String[] args) {

		double[][] m = { { -1, 0, 3 }, { -1, -1, -1 }, { 4, 1, 1 }, { 2, 0.5, 9 }, { 3.5, 2, -1 }, { 3, 1.5, 3 },
				{ -1.5, 4, 2 }, { 5.5, 4, -0.5 } };

		double closestDistance = Double.MAX_VALUE;
		int p1Index = 0;
		int p2Index = 0;

		for (int i = 0; i < m.length - 1; i++) {
			for (int j = i + 1; j < m.length; j++) {
				double distance = findDistance(m[i][0], m[i][1], m[i][2], m[j][0], m[j][1], m[j][2]);
				if (distance < closestDistance) {
					closestDistance = distance;
					p1Index = i;
					p2Index = j;
				}
			}
		}

		System.out.printf("The closest two points are (%.1f, %.1f, %.1f) and (%.1f, %.1f, %.1f)", m[p1Index][0], m[p1Index][1], m[p1Index][2],
				m[p2Index][0], m[p2Index][1], m[p2Index][2]);

	}

	public static double findDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}
