package oop.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class testHashMapEz1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put("1st","Mary");
		map1.put("2nd","Jack");
		map1.put("3rd","James");
		map1.put("4th","Tim");
		map1.put("5th","Layla");
		
		Set set1 = map1.keySet();
		Set value1 = map1.entrySet();
		Collection set2 = map1.values();
		
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(value1);
				

	}

}
