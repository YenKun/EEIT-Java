package oopMethod;
class calculator{
	void plus(int x1,int y1) {
		System.out.println("x1+y1=" + (x1+y1));
	}
	void minus(int x2,int y2) {
		System.out.println("x2-y2=" + (x2-y2));
	}
	void multiply(int x3,int y3) {
		System.out.println("x3*y3=" + (x3*y3));
	}
	void divide(int x4,int y4) {
		System.out.println("x4/y4=" + (x4/y4));
	}
	void function(int a,int b) {
		plus(a,b);
		minus(a,b);
		multiply(a,b);
		divide(a,b);
	}
}

public class testCallMethodEx2 {

	public static void main(String[] args) {
		calculator casio = new calculator();
		casio.plus(4,9);
		casio.minus(98, 14);
		casio.multiply(8, 7);
		casio.divide(4,6);
		System.out.println();
		casio.function(4,6);
		
		

	}

}
