package discovery;

/*	2017.11.22
	Every time u used System.out.println u will call toString method automatically
	Every class has toString method cuz it was written in java.lang.Object
	the code below indicates u can override toString method in each class 
	While u override and change the return value u will get the return value each time u use the System.out.print to print the Object
*/

interface A {
	String toString();

}

class B {
	public String toString() {
		return "Discovery";
	}
}

public class discoveryEx1 {
	public static void main(String[] args) {
		System.out.println(

				new A() {
					public String toString() {
						return "test";
					}
				});
		B b = new B();
		B c = new B();
		System.out.println(b);
		System.out.println(c);

	}
}
