package oop.Inheritance;

class Fish {
	Fish() {

	}
	
	Fish(String name,int feet){
		this.name = name;
		this.feet = feet;
	}

	Fish(String name) {
		this.name = name;
	}

	Fish(int feet) {
		this.feet = feet;
	}
	int feet;
	String name = "nemo";

	void swim() {
		System.out.println(name + " swin under the sea " + feet + " feet");
	}
}

class Shark extends Fish {
	Shark(String name,int feet) {
		super(name,feet);
	}

}

public class testInheritanceEx2 {

	public static void main(String[] args) {
		Shark TigerShark = new Shark("Mary",2000);
		TigerShark.swim();

	}

}
