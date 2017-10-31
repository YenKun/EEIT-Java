package oop.polymorphism;

class Mammal {
	static void play(Mammal m) {
		m.happy();
		if (m instanceof Dogs) {
			Dogs d1 = (Dogs)m;
			d1.Bark();
		}
		if(m instanceof Cats) {
			Cats c1 = (Cats)m;
			c1.Scratch();
		}
	}

	void happy() {
		System.out.println("Happy.");
	}

}

class Dogs extends Mammal {

	@Override
	void happy() {
		System.out.println("Roof Roof Happy.");
	}
	
	void Bark() {
		System.out.println("Wang");
	}

}

class Cats extends Mammal {

	@Override
	void happy() {
		System.out.println("Meow Meow Happy.");
	}
	
	void Scratch() {
		System.out.println("Scratch");
	}

}



public class testPolymorphismEx1 {

	public static void main(String[] args) {
		Dogs snoopy = new Dogs();
		Cats kitty = new Cats();
		Mammal.play(snoopy);
		Mammal.play(kitty);
		Mammal.play(new Mammal());

	}

}
