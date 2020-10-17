package chapter12;

public class Exercise12_07 {

	public static void main(String[] args) {
		int x = bin2Dec("10101010");
		System.out.println(x);

	}

	public static int bin2Dec(String binary) throws NumberFormatException {
		int result = 0;
		for (int i = 0, j = binary.length() - 1; i < binary.length(); i++, j--) {
			if (binary.charAt(i) < '0' || binary.charAt(i) > '1') {
				throw new NumberFormatException();
			} else {
				result += Integer.parseInt(binary.charAt(i) + "") * Math.pow(2, j);
			}

		}
		
		return result;
	}

}
