package flowControlPractice;

public class TestBreakContinueEx1 {

	public static void main(String[] args) {
		for(int i =1;i>0;i++) {
			int randomnum =40;
			int jackpot =(int)(Math.random()*42+1);
			if(randomnum == jackpot) {
				System.out.printf("�??��%d次\n",i);
				System.out.printf("中�?��?�碼?��%d\n\n",jackpot);
				break;
			}
			System.out.println(jackpot);
		}
		int num =3;
		int count = 0;
		while(true) {
			int lucky = (int)(Math.random()*6+1);
			System.out.println("The Number Is: " + lucky);
			if(num == lucky) {
				if(count == 3) {
					System.out.println("You Win");
					break;
					}else {count++;}
				
			}else {
				System.out.println("Try Again");
			}
		}

	}

}