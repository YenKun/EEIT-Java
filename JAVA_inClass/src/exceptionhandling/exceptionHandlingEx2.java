package exceptionhandling;

class Birds {
	void fly() throws  RuntimeException{
		System.out.println("I can fly");
	}
}

class Ducks extends Birds{

	@Override
	void fly() throws ArrayIndexOutOfBoundsException{
		System.out.println("I can swim");
	}
	
}

public class exceptionHandlingEx2 {

	public static void main(String[] args) {
 		Birds uglyDuck = new Ducks();
		uglyDuck.fly();

	}

}
