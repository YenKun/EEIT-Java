package abstractclassnmethod;

abstract class Company {
	abstract void calFuel();

	abstract void calDistance();
}

class Truck extends Company {

	@Override
	void calFuel() {
		System.out.println("Truck Calculate the Fuel.");

	}

	@Override
	void calDistance() {
		System.out.println("Truck Calculate the Distence.");
	}

}

class Ship extends Company {

	@Override
	void calFuel() {
		System.out.println("Ship Calculate the Fuel.");

	}

	@Override
	void calDistance() {
		System.out.println("Ship Calculate the Distence.");
	}

}

public class testAbstractEx1 {

	public static void main(String[] args) {

		Company t;
		t = new Truck();
		t.calFuel();
		t.calDistance();
		t = new Ship();
		t.calFuel();
		t.calDistance();

	}

}
