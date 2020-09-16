package chapter8;

public class Exercise08_18 {

	public static void main(String[] args) {
		int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
		
		shuffle(m);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static void shuffle(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int index = (int)(Math.random() * m.length);
			
			int[] temp = m[index];
			m[index] = m[i];
			m[i] = temp;
			
		}
		
	}

}
