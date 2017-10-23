package flowControlPractice;

public class TestWhileLoopEx2 {

	public static void main(String[] args) {
		int i = 1;
		long sum = 0;
		while(i<=1000000000) {
			sum+=i;
			i++;
		}
		System.out.println("sum=" + sum);
		System.out.println("finished");

	}

}
