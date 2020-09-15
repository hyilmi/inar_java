package chapter8;

public class Exercise08_04 {

	public static void main(String[] args) {
		int[][] hours = { 
			{2, 4, 3, 4, 5, 8, 8},
			{7, 3, 4, 3, 3, 4, 4},
			{3, 3, 4, 3, 3, 2, 2},
			{9, 3, 4, 7, 3, 4, 1},
			{3, 5, 4, 3, 6, 3, 8},
			{3, 4, 4, 6, 3, 4, 4},
			{3, 7, 4, 8, 3, 8, 4},
			{6, 3, 5, 9, 2, 7, 9}};
		
		int[] employeeHours = new int[hours.length];
		
		for (int i = 0; i < hours.length; i++) {
			int sum = 0;
			for (int j = 0; j < hours[i].length; j++) {
				sum += hours[i][j];
			}
			employeeHours[i] = sum;
		}
		
		int[] employeeNumbers = new int [8];
		for (int i = 0; i < employeeNumbers.length; i++) {
			employeeNumbers[i] = i+1;
		}
		
		for (int i = 0; i < employeeHours.length - 1; i++) {
			int maxIndex = i;
			
			for (int j = i+1; j < employeeHours.length; j++) {
				if (employeeHours[j] > employeeHours[maxIndex]) {
					maxIndex = j;
				}
			}
		
			int temp = employeeHours[maxIndex];
			employeeHours[maxIndex] = employeeHours[i];
			employeeHours[i] = temp;
			
			int temp2 = employeeNumbers[maxIndex];
			employeeNumbers[maxIndex] = employeeNumbers[i];
			employeeNumbers[i] = temp2;
			
		}
		
		for (int i = 0; i < employeeNumbers.length; i++) {
			System.out.println("Employee " + employeeNumbers[i] + ": " + employeeHours[i] + " hours");
		}

	}

}
