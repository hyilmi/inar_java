package chapter12;

public class BinaryFormatException extends Exception {
	private String s;
	
	public BinaryFormatException(String s) {
		super(s + " is not a binary string.");
		this.s = s;
	}

}
