package chapter13;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise13_02 {

	public static void main(String[] args) {
		ArrayList<Number> numbers = new ArrayList<Number>();
		for (int i = 0; i < 10; i++) {
			numbers.add(Math.random() * 101);
		}

		System.out.println(numbers.toString());
		shuffle(numbers);
		System.out.println(numbers.toString());

	}

	public static void shuffle(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			int index = (int)(Math.random() * list.size());
			
			Number temp = list.get(i);
			list.set(i, list.get(index) );
			list.set(index, temp);
		}

	}
}
