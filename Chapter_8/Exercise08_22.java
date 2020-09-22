package chapter8;

public class Exercise08_22 {

	public static void main(String[] args) {
		int[][] m = new int[6][6];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int)(Math.random() * 2);
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (int i = 0; i < m.length; i++) {
			int ones = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					ones++;
				}
			}
			
			if (ones % 2 == 0) {
				System.out.println("Row " + i + " has an even number of ones.");
			}else {
				System.out.println("Row " + i + " does not have an even number of ones.");
			}
		}
		
		for (int i = 0; i < m[0].length; i++) {
			int ones = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] == 1) {
					ones++;
				}
			}
			
			if (ones % 2 == 0) {
				System.out.println("Column " + i + " has an even number of ones.");
			}else {
				System.out.println("Column " + i + " does not have an even number of ones.");
			}
		}

	}

}
