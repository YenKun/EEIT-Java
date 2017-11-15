package oop.overriding;

class animal{
	public void eat() {
		System.out.println("animal eats food");
	}
}

class lion extends animal{
	public void eat() {
		System.out.println("lion eats meats");
	}
}

public class testOverridingEx1 {

	public static void main(String[] args) {
		lion lionKing = new lion();
		lionKing.eat();

	}

}
