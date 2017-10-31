package exceptionhandling;

public class exceptionHandlingEx1 {

	public void f(int x,int y) {
		
		try {
		System.out.println(x/y);
		}catch(ArrayIndexOutOfBoundsException k){
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("Hello");
			System.out.println(e);
			//e.printStackTrace();
			System.out.println("\n");
		}finally {
			System.out.println(4/2);
		}
	}
	
	public static void main(String[] args) {
	
		exceptionHandlingEx1 a = new exceptionHandlingEx1();
		a.f(6,0);

	}

}
