package oop.collections;

import java.util.HashSet;

public class testCollections {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("Mary");
		set1.add("John");
		set1.add("Mary");
		set1.add(6);
		set1.add(new Integer(6));
		set1.add(3.14);
		set1.add(3.14);

		System.out.println(set1);

	}

}
