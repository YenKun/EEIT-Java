package practiceQuiz;

public class quizEx10 {
	
	/*
	 * 身分證字號產生器
	 */

	public static void main(String[] args) {
		int titleFinal;
		while(true) {
		int title = (int)(Math.random()*24+10);
			if(title==20||title==25||title==26||title==31) {
			}else {
				titleFinal=title;
				break;
			}
		}
				
		char[] K = new char[] {'A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','U','V','X','Y','W','Z','I'}; 
		int I = titleFinal-10;
		int b1=titleFinal/10;
		int b2=titleFinal%10;

		
		
		int[] ID = new int[] {(int)(Math.random()+1),(int)(Math.random()*9),(int)(Math.random()*9),(int)(Math.random()*9),(int)(Math.random()*9),(int)(Math.random()*9),(int)(Math.random()*9),(int)(Math.random()*9)};
		int sum = 1*b1 + 9*b2 + 8*ID[0] + 7*ID[1]+6*ID[2]+5*ID[3]+4*ID[4]+3*ID[5]+2*ID[6]+ID[7];
		int c1;
		if (sum%10==0) {
			c1=0;
		}else {
			c1=10-sum%10;
		}
		
		
		
		System.out.println(sum);
		System.out.printf("%c%d%d%d%d%d%d%d%d%d\n",K[I],ID[0],ID[1],ID[2],ID[3],ID[4],ID[5],ID[6],ID[7],c1);
		
		
		


	}
}
