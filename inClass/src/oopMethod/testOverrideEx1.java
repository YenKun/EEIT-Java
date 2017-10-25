package oopMethod;

class calculatorX {
	void plus(int x, int y) {
		System.out.println("x+y=" + (x + y));
	}

	void plus(double x, double y) {
		System.out.println("x+y=" + (x + y));
	}
}

public class testOverrideEx1 {

	public static void main(String[] args) {
		new calculatorX().plus(6,8);
		new calculatorX().plus(6.51,8);
	}

}
