package chapter12;

public class HexFormatException  extends Exception  {
	
	private String s;

	public HexFormatException(String s){
		super(s + " is not a hex string.");
		this.s = s;
		
	}
	
	
}



