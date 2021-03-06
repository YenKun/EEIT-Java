package practiceRandom;

class worker implements Runnable{
	RandomPracticeEx3 core1 = new RandomPracticeEx3();
	@Override
	public void run() {
		for(int j = 0 ;j<=50;j++){
			core1.print();
			System.out.println("j: " + j);
		}
		
	}
	
}

class Count implements Runnable{
	
	RandomPracticeEx3 core = new RandomPracticeEx3();

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
		core.setScore(80);
		core.print();
		System.out.println("i: " + i);

		}
	}
	
}

public class RandomPracticeEx3{

	private int score;

	public void print() {
		assert (score >= 0) : "ERROR";
		if (score >= 60) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

	public void setScore(int score) {
		this.score = score;
	}


	public static void main(String[] args) throws Throwable {
		RandomPracticeEx3 Xin = new RandomPracticeEx3();
		Xin.setScore(80);
		Xin.print();
		
		Thread t1 = new Thread(new Count(),"Elvis");
		Thread t2 = new Thread(new worker(),"Wei");
		t1.setPriority(10);
		t1.start();
		
		t2.start();
		t2.join();
		


	}


}
