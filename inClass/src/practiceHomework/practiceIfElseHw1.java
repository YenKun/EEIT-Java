package practiceHomework;

public class practiceIfElseHw1 {

	public static void main(String[] args) {
		/*
		 * �D�G���@����{�������
		 */
		int a = (int) (Math.random() * 10 + 1);
		int b = (int) (Math.random() * 10 + 1);
		int c = (int) (Math.random() * 10 + 1);

		int D = (b * b) - (4 * a * c);
		double Dsqr = Math.sqrt(D);
		
		System.out.println(~b+1);

		if (D < 0) {
			System.out.printf("%dx^2+%dx+%d\n�S�����\n", a, b, c);
		} else if (D == 0) {
			System.out.printf("%dx^2+%dx+%d\n������%.2f\n", a, b, c, (double) (~b + 1) / (2.0 * a));
		} else {
			System.out.printf("%dx^2+%dx+%d\n����۲����%.2f,%.2f\n", a, b, c,  ((~b + 1) + Dsqr) / (2.0 * a),
					 ((~b + 1) - Dsqr) / (2 * a));
		}

	}

}