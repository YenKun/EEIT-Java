package oopMethod.Array;

public class testArraySortNumberEx1 {

	int[] data = { 12, 54, 513, 456, 24, 78, 4, 454, 52, 4, 788, 2 };

	public void sortNumber() {

		for (int i = 0; i < (data.length - 1); i++) {
			for (int j = i + 1; j < (data.length); j++) {
				int sw = 0;
				if (data[i] < data[j]) {
					sw = data[j];
					data[j] = data[i];
					data[i] = sw;
				}
			}
		}
	}

	public void sortNumber2() {
		while (true) {
			int count = 0;
			for (int a = 0; a < (data.length - 1); a++) {
				int sw2 = 0;
				if (data[a] < data[a + 1]) {
					sw2 = data[a];
					data[a] = data[a + 1];
					data[a + 1] = sw2;
					count++;
				}

			}
			if (count == 0) {
				break;
			}
		}
	}

	public void printNumber() {
		for (int k : data) {
			System.out.print(k + ",");
		}
	}

	public static void main(String[] args) {
		testArraySortNumberEx1 action = new testArraySortNumberEx1();
		action.sortNumber2();
		action.printNumber();

	}

}
