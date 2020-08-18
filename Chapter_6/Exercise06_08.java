package chapter6;

public class Exercise06_08 {

	public static void main(String[] args) {
		System.out.printf("Celcius\t\tFahrenheit\t|\tFahrenheit\tCelcius\n");
		System.out.print("-----------------------------------------------------------------\n");
		
		double celcius = 40.0;
		double fahrenheit = 120.0;
		
		for (int i = 0 ; i < 10; i++) {
			System.out.printf("%.1f\t\t", celcius);
			System.out.printf("%.1f\t", celcius2fahrenheit(celcius));
			System.out.print("\t|\t");
			System.out.printf("%.1f\t\t", fahrenheit);
			System.out.printf("%.1f\n", fahrenheit2celcius(fahrenheit));
			
			celcius--;
			fahrenheit -= 10;
		}

	}
	
	public static double celcius2fahrenheit(double celcius) {
		double fahrenheit = (9.0 / 5) * celcius + 32;
		return fahrenheit;
	}
	
	public static double fahrenheit2celcius(double fahrenheit) {
		double celcius = (5.0 / 9) * (fahrenheit - 32);
		return celcius;
	}

}
