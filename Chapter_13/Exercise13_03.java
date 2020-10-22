package chapter13;

import java.util.ArrayList;

public class Exercise13_03 {

	public static void main(String[] args) {
		ArrayList<Number> numbers = new ArrayList<Number>();
		for (int i = 0; i < 10; i++) {
			numbers.add((int) (Math.random() * 101));
		}

		System.out.println(numbers.toString());
		sort(numbers);
		System.out.println(numbers.toString());

	}

	public static void sort(ArrayList<Number> list) {

		for (int i = 0; i < list.size() - 1; i++) {

			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j).doubleValue() < list.get(i).doubleValue()) {
					Number temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}

		}
	}

}
