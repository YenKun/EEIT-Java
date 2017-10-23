package flowControlPractice;

public class TestForLoopHw1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=1;a<=10;a++) {
			for(int b=9;a<=b;b-=1) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		
		

	}

}
