package chapter8;

public class Exercise08_03 {

	/** Main method */
	public static void main(String args[]) {
		// Students' answers to the questions
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		// Key to the questions
		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		int[] studentNumbers = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int[] studentScores = new int[answers.length];

		// Grade all answers
		for (int i = 0; i < answers.length; i++) {
			// Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}

			studentScores[i] = correctCount;
		}

		for (int i = 0; i < studentScores.length - 1; i++) {
			int max = studentScores[i];
			int maxIndex = i;

			for (int j = i + 1; j < studentScores.length; j++) {
				if (studentScores[j] > max) {
					max = studentScores[j];
					maxIndex = j;
				}
			}

			if (maxIndex != i) {
				int temp = studentScores[i];
				studentScores[i] = studentScores[maxIndex];
				studentScores[maxIndex] = temp;

				int temp2 = studentNumbers[i];
				studentNumbers[i] = studentNumbers[maxIndex];
				studentNumbers[maxIndex] = temp2;

			}
		}

		for (int i = 0; i < studentScores.length; i++) {
			System.out.println("Student " + studentNumbers[i] + ": " + studentScores[i] + " correct answers");
		}

	}

}
