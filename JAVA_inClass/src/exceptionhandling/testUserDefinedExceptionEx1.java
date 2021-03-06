package exceptionhandling;

class myException extends Exception {

	private static final long serialVersionUID = 1L;
	private int port;
	private String msg;
	private String server;

	public myException(String server, int port, String msg) {
		this.server = server;
		this.port = port;
		this.msg = msg;
	}

	void showDetails() {
		System.out.println("Server:" + server);
		System.out.println("Port:" + port);
		System.out.println("Message:" + msg);
	}
}

public class testUserDefinedExceptionEx1 {

	public static void main(String[] args) {
		int var = 100;
		if (var%2==0) {
			try {
				throw new myException("DarkIsland",500,"VirusAttack");
			} catch (myException e) {
				e.showDetails();
			}
		}

	}

}
