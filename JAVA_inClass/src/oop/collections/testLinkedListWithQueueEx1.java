package oop.collections;

import java.util.LinkedList;

public class testLinkedListWithQueueEx1 {
	@SuppressWarnings("rawtypes")
	private LinkedList queue;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	void storeList() {
		queue = new LinkedList();
		queue.offer("happy");
		queue.offer("sad");
		queue.offer("sad");
		queue.offer("sad");
	}

	void retrieveList() {
		while (queue.peek() != null) {
			String s = (String) queue.poll();
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		testLinkedListWithQueueEx1 move = new testLinkedListWithQueueEx1();
		move.storeList();
		move.retrieveList();

	}

}
