package chapter10;

public class Exercise10_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Queue{
	private int[] elements;
	private int size;
	private final int CAPACITY = 8;
	
	public Queue() {
		this.elements = new int[CAPACITY];
	}
	
	public Queue(int size) {
		this.size = size;
		this.elements = new int[size];
	}
	
	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		elements[size++] = v;
	}
	
	public void dequeue() {
		//TODO
		
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
}
