package chapter10;

public class Exercise10_23 {

	public static void main(String[] args) {
		String s1 = "Howdy";
		String s2 = "Hello";
		int x = s1.compareTo(s2);
		System.out.println(x);
	}

}
class MyString2{
	
	private String s;
	
	public MyString2(String s) {
		this.s = s;
	}
	
	public int compare(String s) {
		//TODO
	}
	
	public MyString2 substring(int begin) {
		String str = "";
		for (int i = begin; i < s.length(); i++) {
			str += s.charAt(i);
		}
		
		return new MyString2(str);
	}
	
	public MyString2 toUpperCase() {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				str += (char)(s.charAt(i) - ('a' - 'A'));
			}else {
				str += s.charAt(i);
			}
		}
		
		return new MyString2(str);
	}
	
	public char[] toChars() {
		char[] ch = new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(i);
		}
		
		return ch;
	}
	
	public static MyString2 valueOf(boolean b) {
		//TODO
	}
	
}
