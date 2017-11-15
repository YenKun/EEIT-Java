package conditionalPractice;

public class TestSwitchCaseEx1 {

	public static void main(String[] args) {
		int level = 40;
		switch(level) {
		case 50:
			System.out.println("Machine gun.");
		case 40:
			System.out.println("Rifle.");
		case 25:
			System.out.println("Short Sword");
		case 10:
			System.out.println("Stick.");
		case 5:
			System.out.println("Stone.");
		default:
			System.out.println("Your hands.");	
			break;


		}

	}

}
