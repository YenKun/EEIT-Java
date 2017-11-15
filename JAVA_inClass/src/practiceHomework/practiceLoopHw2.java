package practiceHomework;

public class practiceLoopHw2 {

	public static void main(String[] args) {
		/*
		 * 印出等腰三角形的星號
		 */

		int n = 10;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j < n + i && j > n - i) {
					System.out.print("*");
				} else if (j == 2 * n - 1) {
					System.out.println(" ");
				} else {
					System.out.print(" ");
				}
			}
		}

	}

}
