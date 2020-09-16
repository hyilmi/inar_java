package chapter8;

public class Exercise08_16 {

	public static void main(String[] args) {
		int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1} , {4, 1}};
		
		sort(m);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void sort(int[][] m) {
		for (int i = 0; i < m.length - 1; i++) {
			int min = m[i][0];
			int minIndex = i;
			
			for (int j = i + 1; j < m.length; j++) {
				if (m[j][0] < min) {
					min = m[j][0];
					minIndex = j;
				}
			}
			
			if (minIndex != i) {
				int[] temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;
			}
		}
		
		
		
		
	}

}
