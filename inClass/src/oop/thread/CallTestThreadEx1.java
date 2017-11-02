package oop.thread;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "i:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}


	}

}

public class CallTestThreadEx1 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread(), "Jk ");
		Thread thread2 = new Thread(new MyThread(), "Rowling ");
		thread1.start();
		System.out.println("Finished");
		thread2.start();

	}

}
