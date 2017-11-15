package flowControlPractice;

public class TestFunctionHw1 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10 + 1);
		int b = (int) (Math.random() * 10 + 1);
		int c = (int) (Math.random() * 10 + 1);

		int b2 = (int) (Math.pow(b, 2));
		int D = b2 - (4 * a * c);
		double Dsqr = (Math.sqrt(D));
		double sol = (~b + 1 + Dsqr) / 2 * a;
		double sol2 = (~b + 1 - Dsqr) / 2 * a;
		System.out.printf("%dX^2 + %dX + %d = 0\n", a, b, c);
		if (D > 0) {
			System.out.printf("X??‰å…©?›¸?•°å¯¦æ ¹%.4f???%.4f\n", sol, sol2);
		} else if (D == 0) {
			System.out.printf("X??‰é?æ ¹%.4f\n", sol);
		} else {
			System.out.printf("Xæ²’æ?‰å¯¦? ¹\n");
		}

	}

}
