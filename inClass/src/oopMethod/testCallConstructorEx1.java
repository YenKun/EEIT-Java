package oopMethod;

class build{
	int name;
	int age;
	build(int x,int y){
		System.out.println("I am constructor");
		this.name = x;
		this.age = y;
	}
	 void play() {
		 System.out.println("play with me");
	 }
}

public class testCallConstructorEx1 {

	public static void main(String[] args) {
		build start = new build(21,87);
		start.play();
		
		
		new build(21,87).play();
		/*
		 * 		(Anonymous Object)
		 * = 	build start = new build();
		 * 		start.play();
		 * 
		 */
		

		System.out.println(start.name + start.age);
		System.out.println("finished");

	}

}
