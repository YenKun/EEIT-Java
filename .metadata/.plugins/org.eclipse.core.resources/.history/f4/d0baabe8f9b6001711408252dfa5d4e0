package practiceQuiz;

public class quizEx6 {

	public static void main(String[] args) {
		/*
		 * 有一分數序列：2/1，3/2，5/3，8/5，13/8，21/13...
		 * 求出這個數列的前20項之和。
		 */
		
		int down = 1;
		int up =2;
		double sum=0;
		
		for(int n =1;n<=20;n++) {
			int upOrigin=up;
			sum=sum+ (double)up/down;
			up = down+up;
			down = upOrigin;
			System.out.printf("前%d項之合為%f\n",n,sum);
		}




	}
}
