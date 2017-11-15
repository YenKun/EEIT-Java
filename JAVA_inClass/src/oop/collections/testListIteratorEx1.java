package oop.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class testListIteratorEx1 {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Passionfruit");
		fruit.add("Grape");
		fruit.add("Coconuts");
		fruit.add("Waxapple");

		ListIterator<String> i1 = fruit.listIterator();
		while (i1.hasNext()) {
			String myFavor = i1.next();
			System.out.println(myFavor);
		}
		System.out.println("----------------------------");

		ListIterator<String> i2 = fruit.listIterator(5);
		while (i2.hasPrevious()) {
			String LaLa = i2.previous();
			System.out.println(LaLa);
		}

	}

}
