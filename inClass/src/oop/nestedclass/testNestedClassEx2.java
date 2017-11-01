package oop.nestedclass;

class C{
	private static int age = 18;
	static class D{
		void happy() {
			System.out.println("happy age:" + age);
		}
	}
}

public class testNestedClassEx2 {

	public static void main(String[] args) {
		C.D d1 =new C.D();
		d1.happy();

	}

}
