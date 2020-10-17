package chapter12;

public class Exercise12_09 {

	public static void main(String[] args) {
		int x;
		try {
			x = bin2Dec("x");
		} catch (BinaryFormatException e) {
			System.out.println(e.getMessage());
		}

	}

	public static int bin2Dec(String binary) throws BinaryFormatException{
		int result = 0;
		for (int i = 0, j = binary.length() - 1; i < binary.length(); i++, j--) {
			if (binary.charAt(i) < '0' || binary.charAt(i) > '1') {
				throw new BinaryFormatException(binary);
			} else {
				result += Integer.parseInt(binary.charAt(i) + "") * Math.pow(2, j);
			}

		}
		
		return result;
	}

}
