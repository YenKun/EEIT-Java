package oop.nestedclass;

class E{
	private String name = "Jack";
	private String skill = "Java";
	
	void play() {
		class F{
			int value = 6;
			void showDetails() {
				System.out.println(name + " has a skill:" + skill + " value:" + value);
			}
		}
		
		F f1 = new F();
		f1.showDetails();
	}
}

public class testNestedClassEx3 {

	public static void main(String[] args) {
		E e1 = new E();
		e1.play();

	}

}
