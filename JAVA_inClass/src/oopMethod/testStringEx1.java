package oopMethod;

public class testStringEx1 {

	public static void main(String[] args) {

		String data = "abcdefghabcdefgh";
		System.out.println("data.length():" + data.length());
		System.out.println("data.charAt(5):" + data.charAt(5));
		System.out.println("data.toUpperCase():" + data.toUpperCase());
		System.out.println("data.substring(5,8):" + data.substring(5, 8));
		System.out.println("data.indexOf(\"gh\"):" + data.indexOf("gh"));
		System.out.println("data.lastIndexOf(\"gh\"):" + data.lastIndexOf("gh"));

	}

}
