package flowControlPractice;

public class TestBreakContinueLabelEx1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i=" + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println("j=" + j);
				for (int k = 1; k <= 10; k++) {
					System.out.println("k=" + k);
				}
			}
		}

	}

}