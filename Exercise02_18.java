package chapter2;


public class Exercise02_18 {
	public static void main(String[] args) {
		
		System.out.println("a  b  pow(a,b)");
		int a, b;
		a = 1;
		b = 2;
		
		System.out.println(a + "  " + b + "  " + (int)Math.pow(a, b));
		a++;
		b++;
		System.out.println(a + "  " + b + "  " + (int)Math.pow(a, b));
		int a = a++, b = b++;
		System.out.println(a + "  " + b + "  " + (int)Math.pow(a, b));
		int a = a++, b = b++;
		System.out.println(a + "  " + b + "  " + (int)Math.pow(a, b));
		int a = a++, b = b++;
		System.out.println(a + "  " + b + "  " + (int)Math.pow(a, b));

		
		
		

	}

}
