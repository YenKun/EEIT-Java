package practiceHomework;

/*
 * �O���ƦC
 * �j��覡���g
 */

class F {
	int n;

	F(int n) {
		this.n = n;
	}

	long sum() {
		long a1 = 0, a2 = 1, a3 = 0;
		if (n <= 2) {
			a3 = n - 1;
		} else {
			for (int i = 1; i < n - 1; i++) {
				a3 = a1 + a2;
				a1 = a2;
				a2 = a3;

			}
		}
		return a3;
	}
}

public class practiceRecursiveFibonacciHw1 {
	public static void main(String[] args) {
		int N = 48;

		for (int j = 1; j <= N; j++) {
			long k = new F(j).sum();
			System.out.printf("f(%d)=%d\n", j, k);
		}		
			
		


	}
	
	
}