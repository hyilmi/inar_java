package chapter4;

public class Exercise04_25 {

	public static void main(String[] args) {
		
		int plateDigits = (int)(Math.random() * 9000) + 1000;
		
		int plateLetterCode1 = (int)(Math.random()*26) + 65;
		int plateLetterCode2 = (int)(Math.random()*26) + 65;
		int plateLetterCode3 = (int)(Math.random()*26) + 65;
		
		System.out.println(plateDigits + "" + (char)plateLetterCode1 + (char)plateLetterCode2 + (char)plateLetterCode3);
		
		
		
		

	}

}
