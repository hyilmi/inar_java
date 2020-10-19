package chapter10;

public class Exercise10_28 {

	public static void main(String[] args) {
		MyStringBuilder2 s1 = new MyStringBuilder2("ananas");
		MyStringBuilder2 s2 = new MyStringBuilder2("an");
		MyStringBuilder2 s3 = s1.insert(2, s2);
		MyStringBuilder2 s1R = s1.reverse();
		
		System.out.println(s3.getString());
		System.out.println(s1R.getString());
		

	}

}

class MyStringBuilder2 {
	private String s = "";
	private char[] ch = s.toCharArray();

	public MyStringBuilder2() {

	}

	public MyStringBuilder2(char[] chars) {
		this.ch = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			ch[i] = chars[i];
		}
	}

	public MyStringBuilder2(String s) {
		this.s = s;
	}

	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		String newStr = "";
		char[] ch = this.s.toCharArray();

		for (int i = 0; i < offset; i++) {
			newStr += ch[i];
		}
		
		newStr += s.getString();
		
		for (int i = offset; i < ch.length; i++) {
			newStr += ch[i];
		}
		
		return new MyStringBuilder2(newStr);
		
	}

	public MyStringBuilder2 reverse() {
		char[] ch = this.s.toCharArray();
		String newStr = "";
		
		for (int i = ch.length - 1; i >= 0; i--) {
			newStr += ch[i];
		}
		
		return new MyStringBuilder2(newStr);

	}

	public MyStringBuilder2 substring(int begin) {
		char[] ch = this.s.toCharArray();
		String newStr = "";
		
		for (int i = begin; i < ch.length; i++) {
			newStr += ch[i];
		}
		
		return new MyStringBuilder2(newStr);

	}

	public MyStringBuilder2 toUpperCase() {
		char[] ch = this.s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
				ch[i] = Character.toUpperCase(ch[i]);
		}
		
		return new MyStringBuilder2(ch);

	}
	
	public String getString() {
		return this.s;
	}

}
