package abstractclassnmethod;

public class testAbstractEx2 {
	
	void processAction(Company corp) {
		corp.calFuel();
		corp.calDistance();
	}

	public static void main(String[] args) {
		
		testAbstractEx2 abs1 = new testAbstractEx2();
		abs1.processAction(new Truck());
		abs1.processAction(new Ship());
	}

}
