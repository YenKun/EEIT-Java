package oop.nestedclass;

class A{
	private String name = "Mary";
	class B{
		B(){
			System.out.println("Constructing");
		}
		void sayHello() {
			System.out.println(name + " say hello.");
		}
	}
	
	void process() {
		B b1 = new B();
		b1.sayHello();
	}
}


public class testNestedClassEx1 {

	public static void main(String[] args) {
		
		A action = new A();
		action.process();
		A.B bb = action.new B();
		bb.sayHello();
		System.out.println("Finished");

	}

}
