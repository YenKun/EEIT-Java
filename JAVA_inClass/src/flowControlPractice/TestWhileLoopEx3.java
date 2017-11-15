package flowControlPractice;

public class TestWhileLoopEx3 {

	public static void main(String[] args) {
		int j = 1;
		while(j<=10) {
			int k = 1;
			while(k<=j) {
				System.out.print("@");
				k++;
			}
			System.out.println();
			j++;
		}

	}

}
