package oopMethod.Array;

public class test2DArray {

	public static void main(String[] args) {
		int[][] data = new int[2][3];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;
		data[1][0] = 4;
		data[1][1] = 5;
		data[1][2] = 6;
		for (int[] y : data) {
			for (int x : y) {
				System.out.println(x);
			}
		}

	}

}