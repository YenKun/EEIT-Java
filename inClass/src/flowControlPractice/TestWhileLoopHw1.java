package flowControlPractice;

public class TestWhileLoopHw1 {

	public static void main(String[] args) {
		int j = 1;
		while (j < 10) {
			int i = 1;
			while (i < 10) {
				System.out.printf("%d\u00d7%d=%2d\t",j,i,i*j);
				i++;
			}
			System.out.println();
			j++;
			
		}
	}

}