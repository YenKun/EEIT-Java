package practiceLoopQuiz;

public class quizEx9 {
	
	
	/*
	 * ªü©i´µ§§¼Æ 153 = 1*1*1 + 5*5*5 + 3*3*3
	 */
	
	

	public static void main(String[] args) {
		System.out.println("solution1:");
		int a, b, c;
		for (a = 1; a < 10; a++) {
			for (b = 0; b < 10; b++) {
				for (c = 0; c < 10; c++) {
					if ((a * a * a) + (b * b * b) + (c * c * c) == (100 * a) + (10 * b) + c) {
						System.out.println(100 * a + 10 * b + c);
					}
				}
			}
		}
		System.out.println("solution2:");

		for (int i = 100; i < 1000; i++) {
			int a1 = i / 100;
			int k = i % 100;
			int b1 = k / 10;
			int c1 = k % 10;
			if ((a1 * a1 * a1) + (b1 * b1 * b1) + (c1 * c1 * c1) == (100 * a1) + (10 * b1) + c1) {
				System.out.println(100 * a1 + 10 * b1 + c1);
			}
		}

	}

}
