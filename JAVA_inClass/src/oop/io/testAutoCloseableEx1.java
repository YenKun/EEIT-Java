package oop.io;

class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("System Closed");

	}

	void processResource() {
		System.out.println("Resources Processing");
	}
}

public class testAutoCloseableEx1 {

	public static void main(String[] args) {

		try (MyResource resource = new MyResource()) {
			resource.processResource();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
