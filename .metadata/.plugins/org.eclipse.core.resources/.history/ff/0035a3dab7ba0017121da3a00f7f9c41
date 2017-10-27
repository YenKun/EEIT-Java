package practiceQuiz;
import java.util.Scanner;

/*
 * 給予一個陣列，讓使用者可以搜尋指定數字，找到顯示索引值，找不到顯示-1 * 
 */

public class quizEx13 {

	public static void main(String[] args) {

		int[] kk = { 1, 10, 31, 33, 37, 48, 60, 70, 80 };
		System.out.println("請輸入一個數字");
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
