package practiceHomework;

public class practiceLoopHw1 {

	public static void main(String[] args) {
		/*
		 * �L�X�����T���Ϊ��P��
		 */
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == i) {
					System.out.println("*");
				} else {
					System.out.print("*");
				}
			}
		}
		System.out.println();

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n - a + 1; b++) {
				if (b == n - a + 1) {
					System.out.println("*");
				} else {
					System.out.print("*");
				}
			}
		}

	}

}
