package chapter6;

public class Exercise06_15 {

	public static void main(String[] args) {
		System.out.print("Taxable\t");
		System.out.print("\tSingle\t");
		System.out.print("\tMarried Joint\t");
		System.out.print("\tMarried\t");
		System.out.println("\tHead of");
		
		System.out.print("Income \t");
		System.out.print("\t\t");
		System.out.print("\tor Qualifying\t");
		System.out.print("\tSeperate\t");
		System.out.println("a House");
		
		System.out.println("\t\t\t\tWidow(er)");
		System.out.println("-------------------------------------------------------------------------------");
		
		double income = 50000;
		while(income <= 60000) {
			System.out.printf("%.0f\t\t", income);
			System.out.printf("%.0f\t\t", single(income));
			System.out.printf("%.0f\t\t\t", marriedJoint(income));
			System.out.printf("%.0f\t\t", marriedSeperate(income));
			System.out.printf("%.0f\n", headOfHouse(income));
			income += 50;
		}

	}

	private static double headOfHouse(double income) {
		double tax = 0;
		tax += (income <= 11950) ? income * 0.10 : 11950 * 0.10;
		if (income > 11950)
			tax += (income <= 45500) ? (income - 11950) * 0.15 : (45500 - 11950) * 0.15;
		if (income > 45500)
			tax += (income <= 117450) ? (income - 45500) * 0.25 : (117450 - 45500) * 0.25;
		if (income > 117450)
			tax += (income <= 190200) ? (income - 117450) * 0.28 : (190200 - 117450) * 0.28;
		if (income > 190200)
			tax += (income <= 372950) ? (income - 190200) * 0.33 : (372950 - 190200) * 0.33;
		if (income > 372950)
			tax += (income - 372950) * 0.35;
		return Math.round(tax);
	}

	private static double marriedSeperate(double income) {
		double tax = 0;
		tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;
		if (income > 8350)
			tax += (income <= 33950) ? (income - 8350) * 0.15 : (33950 - 8350) * 0.15;
		if (income > 33950)
			tax += (income <= 68525) ? (income - 33950) * 0.25 : (68525 - 33950) * 0.25;
		if (income > 68525)
			tax += (income <= 104425) ? (income - 68525) * 0.28 : (104425 - 68525) * 0.28;
		if (income > 104425)
			tax += (income <= 186475) ? (income - 104425) * 0.33 : (186475 - 104425) * 0.33;
		if (income > 186475)
			tax += (income - 186475) * 0.35;
		return Math.round(tax);
	}

	private static double marriedJoint(double income) {
		double tax = 0;
		tax += (income <= 16700) ? income * 0.10 : 16700 * 0.10;
		if (income > 16700)
			tax += (income <= 67900) ? (income - 16700) * 0.15 : (67900 - 16700) * 0.15;
		if (income > 67900)
			tax += (income <= 137050) ? (income - 67900) * 0.25 : (137050 - 67900) * 0.25;
		if (income > 137050)
			tax += (income <= 208850) ? (income - 137050) * 0.28 : (208850 - 137050) * 0.28;
		if (income > 208850)
			tax += (income <= 372950) ? (income - 208850) * 0.33 : (372950 - 208850) * 0.33;
		if (income > 372950)
			tax += (income - 372950) * 0.35;
		return Math.round(tax);
	}

	private static double single(double income) {
		double tax = 0;
		tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;
		if (income > 8350)
			tax += (income <= 33950) ? (income - 8350) * 0.15 : 25600 * 0.15;
		if (income > 33950)
			tax += (income <= 82250) ? (income - 33950) * 0.25 : 48300 * 0.25;
		if (income > 82250)
			tax += (income <= 171550) ? (income - 82250) * 0.28 : 89300 * 0.28;
		if (income > 171550)
			tax += (income <= 372950) ? (income - 171550) * 0.33 : 201400 * 0.33;
		if (income > 372950)
			tax += (income - 372950) * 0.35;
		return Math.round(tax);
	}

}
