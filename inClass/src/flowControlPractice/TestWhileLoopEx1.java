package flowControlPractice;

public class TestWhileLoopEx1 {

	public static void main(String[] args) {
		int i = 5,j=3;
		while(i<=15) {
			System.out.println("Hello  " + i);
			while(j<=i) {
				System.out.println("Bye  " + j);
				j++;
				
			}
			i+=3;
		}

	}

}
