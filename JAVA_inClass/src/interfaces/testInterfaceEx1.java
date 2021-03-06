package interfaces;

class Animals {
	void eat() {
		System.out.println("Eat something");
	}
}

interface Flyer {
	void takeOff();

	void fly();

	void land();
}

class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplane take off.");
	}

	@Override
	public void fly() {
		System.out.println("Airplane fly.");

	}

	@Override
	public void land() {
		System.out.println("Airplane land.");

	}

}

class Birds extends Animals implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Birds take off.");
	}

	@Override
	public void fly() {
		System.out.println("Birds fly.");

	}

	@Override
	public void land() {
		System.out.println("Birds land.");

	}

	@Override
	void eat() {
		System.out.println("Birds eat worms");
	}

}

class Copter extends Airplane {

	@Override
	public void takeOff() {
		System.out.println("Copter take off.");
	}

	@Override
	public void fly() {
		System.out.println("Copter fly.");

	}

	@Override
	public void land() {
		System.out.println("Copter land.");

	}
}

public class testInterfaceEx1 {

	void processAction(Flyer F) {
		F.takeOff();
		F.fly();
		F.land();

		if (F instanceof Birds) {
			Birds B = (Birds) F;
			B.eat();
		}
	}

	public static void main(String[] args) {

		testInterfaceEx1 test = new testInterfaceEx1();
		test.processAction(new Airplane());
		test.processAction(new Birds());
		test.processAction(new Copter());

		

	}

}
