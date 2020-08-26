package chapter6;

public class Exercise06_11 {

	public static void main(String[] args) {
		System.out.println("Sales Amount\tCommission");
		System.out.println("--------------------------");

		double salesAmount = 10_000;
		while (salesAmount <= 100_000) {
			System.out.printf("%.0f\t\t", salesAmount);
			System.out.printf("%.0f\n", commission(salesAmount));

			salesAmount += 5000;
		}

	}

	private static double commission(double salesAmount) {
		double commission = 0;
		double balance = 0;

			if (salesAmount >= 10000.01)
				balance = salesAmount - 10000;
				commission += balance * 0.12;

			if (salesAmount >= 5000.01)
				balance -= balance - 5000;
				commission += balance * 0.10;

			if (salesAmount >= 0.01)
				commission += balance * 0.08;


		return Math.round(commission);

	}

}
