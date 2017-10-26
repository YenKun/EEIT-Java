package practiceQuiz;

public class quizEx2 {

	public static void main(String[] args) {
		
		/*
		 * 質因數分解
		 */
		
		int a = 128;//(int)(Math.random()*100+1);
		int k = a;
		for (int b = 2; b <= a; b++) {
			if (a % b == 0) {
				a /= b;
				if (a == 1) {
					System.out.print(b + "=" + k + "\n");
				} else {
					System.out.print(b + "\u00d7");
					b--;
				}
			}
		}



	}
}
