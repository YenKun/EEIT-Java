package practiceRandom;
class Bank{
	Bank(){
		
	}
	Bank(int...t){
		System.out.println("Start");
	}
	Bank(Integer c){
		System.out.println("Finished");
	}
}

public class RandomPracticeEx1 {

	public static void main(String[] args) {
		Integer k = 5;
		Integer p = 56;
		Integer t = 1;
		Bank ss = new Bank(k,p,t);

	}

}
