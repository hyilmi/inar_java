package chapter10;

public class Exercise10_25 {

	public static void main(String[] args) {
		String s = "ab/!ac/!bc";
		String[] arr = split(s, "[/!]");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static String[] split(String s, String regex) {
		String[] result = new String[s.length()];
		for (int i = 0; i < result.length; i++) {
			result[i] = "";
		}
		
		if (regex.length() == 1) {
			int index = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == regex.charAt(0)) {
					index++;
				}else {
					result[index] += s.charAt(i);
				}
			}
		}else {
			char[] delimeters = new char[regex.length() - 2];
			for (int i = 1, j = 0; i < delimeters.length - 1 ; i++, j++) {
				delimeters[j] += regex.charAt(i);
			}
			
			int index = 0;
			for (int i = 0; i < s.length(); i++) {
				boolean inDelimeters = false;
				for (int j = 0; j < delimeters.length; j++) {
					if (s.charAt(i) == delimeters[j]) {
						inDelimeters = true;
						break;
					}
				}
				
				if (inDelimeters) {
					index++;
				}else {
					result[index] += s.charAt(i);
				}
			}
			
		}
		
		return result;
		
	}
}
