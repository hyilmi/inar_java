package chapter13;

import java.util.ArrayList;

public class Exercise13_08 {

	public static void main(String[] args) {

	}

}

class MyStack implements Cloneable {
	private ArrayList<Object> list = new ArrayList<>();

	public Object clone() throws CloneNotSupportedException {
		MyStack clone = (MyStack) super.clone();
		ArrayList<Object> newList = new ArrayList<Object>();

		for (int i = 0; i < list.size(); i++) {
			newList.add(list.get(i));
		}

		clone.list = newList;

		return clone;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
