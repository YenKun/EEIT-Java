package oop.nestedclass;

class Shark {
	void eat() {
		System.out.println("Seal");
	}
}


//Replacement
//
//class GreyShark extends Shark{
//
//	@Override
//	void eat() {
//		System.out.println("Fish");
//		
//	}
//	
//}

public class testNestedClassEx4 {

	public static void main(String[] args) {
		
//		Replacement
//		
//		GreyShark shark = new GreyShark();
//		shark.eat();
		
		
		
		/*
		 * 1.Nested class
		 * 2.Extends
		 * 3.Override
		 * 
		 */
		
		new Shark() {
			void eat() {
				System.out.println("Fish");
			}
		}.eat();

	}

}
