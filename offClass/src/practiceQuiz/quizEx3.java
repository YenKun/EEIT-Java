package practiceQuiz;

public class quizEx3 {

	public static void main(String[] args) {
		/*
		 * �@�y�q100�̰��צۥѸ��U�A�C�����a��ϸ��^�찪�ת��@�b�F
		 * �A���U�A�D���b ��10�����a�ɡA�@�g�L�h�̡֦H��10���ϼu�h���H
		 */
		
		double a =100;
		double sum1 = 0;
		double sum2 = 0;
		for(int n=1;n<=10;n++) {
			
			sum2+=2*a;
			a/=2.0;
			sum1+=3*a;
			
			
			System.out.printf("��%d���ϼu�����׬�%.2f����\n",n,a);
			System.out.printf("��%d���ϼu�Ҹg�L�����׬�%.2f����\n",n,sum1);
			System.out.printf("��%d�����a�Ҹg�L�����׬�%.2f����\n",n,sum2-100);
		}

	}
}
