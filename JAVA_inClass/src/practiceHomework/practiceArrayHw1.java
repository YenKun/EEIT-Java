package practiceHomework;

/*
 * 任給1~42數字100000個，試統計各數字所產生的次數並由大到小排列
 */



class arrayData {
	int[] data = new int[100000];
	int[] num = new int[42];
	int[] count = new int[42];

	void setNumber() {
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 42 + 1);
		}

		for (int j = 0; j < num.length; j++) {
			num[j] = (j + 1);
		}
		for (int k = 0; k < count.length; k++) {
			count[k] = 0;
		}

	}

	void calculateNumber() {
		for (int a = 0; a < data.length; a++) {
			for (int b = 0; b < num.length; b++)
				if (data[a] == num[b]) {
					count[b]++;
				}
		}
	}

	void printNumber() {

		for (int c = 0; c < num.length; c++) {
			System.out.printf("%6d:%5d\t", num[c], count[c]);
			if((c+1)%7==0) {
				System.out.println();
			}
		}

	}

	void sortNumber() {

		while (true) {
			int sum = 0;
			for (int d = 0; d < count.length - 1; d++) {
				int sw1 = 0;
				int sw2 = 0;
				if (count[d] < count[d + 1]) {
					sw1 = count[d];
					sw2 = num[d];
					count[d] = count[d + 1];
					num[d] = num[d + 1];
					count[d + 1] = sw1;
					num[d + 1] = sw2;
					sum++;
				}

			}
			if (sum == 0) {
				break;
			}

		}

	}
}

public class practiceArrayHw1 {

	public static void main(String[] args) {

		arrayData action = new arrayData();
		action.setNumber();
		action.calculateNumber();
		System.out.println("\nOringal\tData\n");
		action.printNumber();
		action.sortNumber();
		System.out.println("\nSorted\tData\n");
		action.printNumber();

	}

}
