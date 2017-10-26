package oop;

public class testEualsEx1 {

	public static void main(String[] args) {
		String str1 = "HELLO";
		String str2 = new String("hello");
		String str3 = str2.toUpperCase();
		
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));

	}

}
