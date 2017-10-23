package flowControlPractice;

public class TestForLoopHw2 {

	public static void main(String[] args) {

		int k = 5;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= 2 * k - 1; j++) {
				if (j < (k + i) && j > (k - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
