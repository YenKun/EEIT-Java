package conditionalPractice;

public class TestIfEx1 {

	public static void main(String[] args) {
		
		int number = (int)(Math.random()*6+1);
		if (number <= 2) {
			System.out.println("Small");
		}else if(number >2 && number <5){
			System.out.println("Medium");
		}else {
			System.out.println("Big");
		}
		System.out.println("number:" + number);
	}
	
}
