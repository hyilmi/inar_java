package chapter6;

public class Exercise06_13 {

	public static void main(String[] args) {
		
		System.out.print("i     |     m(i)\n");
		System.out.println("------------------");
		
		int i = 1;
		
		for (int j = 0; j < 20; j++) {
			System.out.printf("%-3d         ", i);
			System.out.printf("%5.3f\n", m(i));
			i++;
		}
		
		

	}
	
	public static double m(int i) {
		double n = 0;
		
		for (double j = 1; j <= i; j++) {
			n += j/(j+1);
		}
		
		return n;
	}

}
