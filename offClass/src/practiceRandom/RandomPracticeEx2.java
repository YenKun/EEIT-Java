package practiceRandom;

public class RandomPracticeEx2 {

	public static void main(String[] args) throws  Throwable{
		RandomPracticeEx2 te = new RandomPracticeEx2();
			te.test(15);
		
	}

	public void test(int x) throws Throwable{
		
		if (x == 0) {
			throw new Exception("�ڻ{��0�O���~�I�I�I");
		}
		else if(x == 1) {
			throw new RuntimeException("1���Ӧn");
		}
		else if (x == 2) {
			throw new Exception("NoNoNo");
		}else {
			throw new Throwable("La");
			
		}
		
		
	}
}