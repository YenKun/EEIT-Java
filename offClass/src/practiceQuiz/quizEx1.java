package practiceQuiz;

public class quizEx1 {

	public static void main(String[] args) {
		
		/*
		 * ―程そ计㎝程そ计
		 */
		
		int m = (int) (Math.random() * 100 + 1);
		int n = (int) (Math.random() * 100 + 1);
		int k, s;

		if (m > n) {
			k = n;
			s = m;
		} else {
			k = m;
			s = n;
		}
		for (; k > 0; k--) {
			if (m % k == 0 && n % k == 0 && k > 0) {
				System.out.printf("%d㎝%d程そ计%d\n", m, n, k);
				break;
			}
		}

		for (;; s++) {

			if (s % m == 0 && s % n == 0) {
				System.out.printf("%d㎝%d程そ计%d", m, n, s);
				break;
			}
		}

	}

}
