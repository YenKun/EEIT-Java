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
			System.out.printf("買到了，還剩下%d元\n",result);
		}else {
			System.out.printf("錢不夠，還差%d元", ~(result)+1);
		}

	}

}
