package practiceQuiz;
import java.util.Scanner;

/*
 * �����@�Ӱ}�C�A���ϥΪ̥i�H�j�M���w�Ʀr�A�����ܯ��ޭȡA�䤣�����-1 * 
 */

public class quizEx13 {

	public static void main(String[] args) {

		int[] kk = { 1, 10, 31, 33, 37, 48, 60, 70, 80 };
		System.out.println("�п�J�@�ӼƦr");
		@SuppressWarnings("resource")
		Scanner getNum = new Scanner(System.in);
		int numberGot = getNum.nextInt();
		int count = 0;
		for (int i = 0; i < kk.length; i++) {
			if (numberGot == kk[i]) {
				System.out.println("index[" + i + "]");
				count++;
			} else if (i + 1 == kk.length && count == 0) {
				System.out.println(-1);
			} else {
				continue;
			}
		}

	}
}
