package conditionalPractice;

public class IfNestEx1 {
	public static void main(String[] args) {
		int value = (int) (Math.random() * 200 - 100);
		if (value > 0 && value % 2 == 0) {
			System.out.println("value=" + value + "?���??��?��");
		} else if (value < 0 && value % 2 == 0) {
			System.out.println("value=" + value + "?��負偶?��");
		} else if (value > 0 && value % 2 != 0) {
			System.out.println("value=" + value + "?���?奇數");
		} else if (value < 0 && value % 2 != 0) {
			System.out.println("value=" + value + "?��負�?�數");
		} else {
			System.out.println("value?�為" + value);
		}
	}

}