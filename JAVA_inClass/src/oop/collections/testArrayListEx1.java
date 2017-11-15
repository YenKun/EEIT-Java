package oop.collections;


import java.util.ArrayList;

public class testArrayListEx1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add("Mary");
		list1.add("John");
		list1.add("Mary");
		list1.add(6);
		list1.add(new Integer(6));
		list1.add(3.14);
		list1.add(3.14);

		
		list1.remove(2);
		list1.remove("Mary");
		System.out.println(list1.size());
		System.out.println(list1);
		

	}

}
