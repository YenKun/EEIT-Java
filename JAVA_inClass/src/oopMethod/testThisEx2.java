package oopMethod;

public class testThisEx2 {
	
	int level;
	
	public testThisEx2() {
		this(10);
		System.out.println("First Constructor");	
	}
	
	public testThisEx2(int level) {
		System.out.println("level:" + level);
	}

	public static void main(String[] args) {
		testThisEx2 k = new testThisEx2();

	}

}
