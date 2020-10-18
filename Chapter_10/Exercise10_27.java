package chapter10;

public class Exercise10_27 {

	public static void main(String[] args) {
		MyStringBuilder s1 = new MyStringBuilder("howdy");
		MyStringBuilder s2 = new MyStringBuilder(" 2");

		System.out.println(s1.getString());
		s1 = s1.append(s2);
		System.out.println(s1.getString());


	}

}

class MyStringBuilder{
	private String s = "";
	
	public MyStringBuilder(String s) {
		this.s = s;
	}
	
	public MyStringBuilder append(MyStringBuilder s) {
		String newString = this.s;
		newString += s.getString();
		return new MyStringBuilder(newString);
	}
	
	public MyStringBuilder append(int n) {
		String newString = this.s;
		newString += n + "";
		return new MyStringBuilder(newString);
	}
	
	public int length() {
		return this.s.length();
	}
	
	public char charAt(int i) {
		return s.charAt(i);
	}
	
	public String getString() {
		return this.s;
	}
}
