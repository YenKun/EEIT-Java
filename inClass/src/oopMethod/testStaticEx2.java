package oopMethod;


public class testStaticEx2 {
	
	int a = 1;
	static int b = 2;

	void play(int c) {
		int d = 4;
		System.out.printf("%d\n%d\n%d\n%d\n", a, b, c, d);
	}

	static void play2(int e) {
		System.out.printf("%d\n%d\n", b, e);
	}

	public static void main(String[] args) {

		testStaticEx2 function = new testStaticEx2();
		function.play(3);
		testStaticEx2.play2(7);
		play2(4);

	}

}
