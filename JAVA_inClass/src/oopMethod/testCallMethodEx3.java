package oopMethod;
class buySth{
	public int buyX(int money) {
		System.out.println("X cost :" + money);
		return (money-430000);
	}
}

public class testCallMethodEx3 {

	public static void main(String[] args) {
		buySth action = new buySth();
		int result = action.buyX(1);
		if(result>=0) {
			System.out.printf("�R��F�A�ٳѤU%d��\n",result);
		}else {
			System.out.printf("�������A�ٮt%d��", ~(result)+1);
		}

	}

}