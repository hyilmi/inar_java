package chapter11;

import java.util.ArrayList;

public class StackClass extends ArrayList<Object>{

	public Object pop() {
		Object o = get(size() - 1);
		remove(size() - 1);
		return o;
	}

	public void push(Object o) {
		 add(o);
	 }
	
	public String toString() {
		return "Stack: " + toString();
	}
}

