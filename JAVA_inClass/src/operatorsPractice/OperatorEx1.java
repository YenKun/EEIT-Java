package operatorsPractice;

public class OperatorEx1 {

	public static void main(String[] args) {

		
		int i = 1,j=2,g;
		g = i++ + ++j;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("g=" + g);
		System.out.println(-6>>>2);
		
		
		
		int k = 1;
		while(k <= 10) {
			System.out.print("k=" + k);
			k++;
		}
		int p = 1;
		for(p = 1;p<=10;p++) {
			System.out.print("p=" + p);
		}
	}

}