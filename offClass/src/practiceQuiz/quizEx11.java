package practiceQuiz;

/*
 *  �O���ƦC 
 *  ���j�覡���g
 *  k�Ȭ�method�B�@�F�X��
 *
 */

public class quizEx11 {
	
	long k;
	

	public long fib(int x) {
		
		k++;
		
		if (x == 1 || x == 2) {
			return 1;
		}else {
			return fib(x - 1) + fib(x - 2);
		}
	}

	public static void main(String[] args) {
		quizEx11 total= new quizEx11();
		for (int i = 1; i < 10; i++) {
			System.out.println(total.fib(i));
		}
		System.out.println(total.k);

	}
}

