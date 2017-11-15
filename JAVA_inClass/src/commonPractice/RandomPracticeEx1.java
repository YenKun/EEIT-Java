package commonPractice;

public class RandomPracticeEx1 {

	public static void main(String[] args) {
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				for (int c = 1; c < 10; c++) {
					if (a * a * a + b * b * b + c * c * c == 100 * a + 10 * b + c) {
						System.out.println(100 * a + 10 * b + c);
					}
				}
			}
		}

	}
}
