package oop.io;

class maze {
	private int x = 0;
	private int y = 0;

	public synchronized void move(int x, int y) {
		//synchronized (this) {
			this.x = x;
			this.y = y;
			System.out.println("x:" + x + " y:" + y);
			this.notify();
		//}
	}

	public synchronized void check() {
		//synchronized (this) {
			try {
				this.wait();

				if (x == 0 && y == 0) {
					System.out.println("I will Survive");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		//}
	}
}

class Hero implements Runnable {

	private maze core;

	public Hero(maze core) {
		this.core = core;
	}

	@Override
	public void run() {

		while (true) {

			int x = (int) (Math.random() * 5);
			int y = (int) (Math.random() * 5);
			try {
				Thread.sleep((long) Math.random() * 800 + 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			core.move(x, y);

		}

	}

}

class Mazecheck implements Runnable {
	private maze core = new maze();

	Mazecheck(maze core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			core.check();
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class testSyncronizedEx1 {

	public static void main(String[] args) {
		maze core = new maze();
		// Hero apolo = new Hero(core);
		Thread t1 = new Thread(new Hero(core));
		Thread t2 = new Thread(new Mazecheck(core));
		t1.start();
		t2.start();

	}

}
