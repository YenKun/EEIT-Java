package oop.collections;

class testInterger {
	private Integer i1;

	public Integer getI1() {
		return i1;
	}

	public void setI1(Integer i1) {
		this.i1 = i1;
	}

}

class testDouble {
	private Double i2;

	public Double getI2() {
		return i2;
	}

	public void setI2(Double i2) {
		this.i2 = i2;
	}

}

class testObject {
	private Object i3;

	public Object getI3() {
		return i3;
	}

	public void setI3(Object i3) {
		this.i3 = i3;
	}
}

// ...

class testGenerics<T> {
	private T I;

	public T getI() {
		return I;
	}

	public void setI(T i) {
		I = i;
	}
}

public class testCallGenericsEx1 {

	public static void main(String[] args) {
		testGenerics<Integer> test1 = new testGenerics<Integer>();
		test1.setI(18);
		int x = test1.getI();
		System.out.println(x * 5);

		testGenerics<Double> test2 = new testGenerics<Double>();
		test2.setI(3.14);
		double y = test2.getI();
		System.out.println(y * 10 * 10);
	}

}
