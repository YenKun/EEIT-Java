package oop.Inheritance;

class grandparents {
	int age = 65;
}

class parents extends grandparents {
	String name = "John";

	void walk() {
		System.out.println("walk:" + name);
	}

}

class child extends parents {
	void play() {
		System.out.println("Play Games");
	}
}

public class testInheritanceEx1 {

	public static void main(String[] args) {
		child x = new child();
		x.name = "mike";
		System.out.println(x.age);
		x.walk();
		x.play();

	}

}
