package practiceRandom;

interface Shark {
	void eat();
}

public class RandomPracticeEx1 {

	public static void main(String[] args) {
		new Shark() {
			// pulic �W���n!!! interface�w�]��public�N��S�g
			public void eat() {
				System.out.println("eat sth");
			}
		}.eat();
		
		new Shark() {
			// pulic �W���n!!! interface�w�]��public�N��S�g
			public void eat() {
				System.out.println("eat sth");
			}
			public void go() {System.out.println("Start");}
		}.go();

		Shark TigerShark = new Shark() {
			public void eat() {
				System.out.println("eat sth");
			}
		};
		TigerShark.eat();

	}

}
