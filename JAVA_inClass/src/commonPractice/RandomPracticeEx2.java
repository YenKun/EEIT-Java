package commonPractice;

public class RandomPracticeEx2 {

	public static void main(String[] args) {
		int m = 1000, n = 495, k;
		if (m > n) {
			k = n;
		} else {
			k = m;
		}
		
		while (k >= 1) {
			if (m % k == 0 && n % k == 0) {
				System.out.print("??大公??�數?��" + k);
				break;
			}
			k--;
		}

	}

}
