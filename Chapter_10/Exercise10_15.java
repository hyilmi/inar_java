package chapter10;

import java.util.Scanner;

public class Exercise10_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five points: ");

		double[][] points = new double[5][2];

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		MyRectangle2D result = getRectangle(points);

		System.out.printf("The bounding rectangle's center (%.2f, %.2f), width %.2f, height %.2f", result.getX(),
				result.getY(), result.getWidth(), result.getHeight());

	}

	public static MyRectangle2D getRectangle(double[][] points) {
		double minX = points[0][0];
		double maxX = points[0][0];
		for (int i = 0; i < points.length; i++) {
			if (points[i][0] < minX) {
				minX = points[i][0];
			}

			if (points[i][0] > maxX) {
				maxX = points[i][0];
			}
		}

		double minY = points[0][1];
		double maxY = points[0][1];
		for (int i = 0; i < points.length; i++) {
			if (points[i][1] < minY) {
				minY = points[i][1];
			}

			if (points[i][1] > maxY) {
				maxY = points[i][1];
			}
		}

		double x = (maxX + minX) / 2;
		double y = (maxY + minY) / 2;
		double width = Math.abs(minX - maxX);
		double length = Math.abs(minY - maxY);

		return new MyRectangle2D(x, y, width, length);

	}

}
