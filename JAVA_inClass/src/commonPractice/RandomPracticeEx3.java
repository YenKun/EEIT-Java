package commonPractice;

public class RandomPracticeEx3 {

	public static void main(String[] args) {
		int k = 688;
		System.out.print(k + "??�質??�數??�解?��");
		for (int i = 2; i <= k; i++) {
			while (k % i == 0) {
				if (k/i==1) {
					System.out.print(i);
				} else {
					System.out.print(i + "\u00d7");
				}
				k = k / i;

			}
		}

	}

}
