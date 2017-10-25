package practiceQuiz;

public class quizEx3 {

	public static void main(String[] args) {
		/*
		 * 一球從100米高度自由落下，每次落地後反跳回原高度的一半；
		 * 再落下，求它在 第10次落地時，共經過多少米？第10次反彈多高？
		 */
		
		double a =100;
		double sum1 = 0;
		double sum2 = 0;
		for(int n=1;n<=10;n++) {
			
			sum2+=2*a;
			a/=2.0;
			sum1+=3*a;
			
			
			System.out.printf("第%d次反彈的高度為%.2f公尺\n",n,a);
			System.out.printf("第%d次反彈所經過的長度為%.2f公尺\n",n,sum1);
			System.out.printf("第%d次落地所經過的長度為%.2f公尺\n",n,sum2-100);
		}

	}
}
