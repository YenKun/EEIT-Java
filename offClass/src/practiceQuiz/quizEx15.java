package practiceQuiz;

/*
 * Pascal Triangle
 * 
 */

public class quizEx15 {

	public static void main(String[] args) {
		int n = 14;
		String[][] array = new String[n][2 * n - 1];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = "0";
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (j > n - 1 - i && j < n - 1 + i) {
					if (j == n + i || j == n - i) {
						array[i][j] = "1";
					} else {

						array[i][j] = String.valueOf(Integer.parseInt(array[i - 1][j - 1]) + Integer.parseInt(array[i - 1][j + 1]));

					}
				} else {
					array[i][j] = "0";
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j].equals("0")) {
					System.out.print("   ");
				} else {
					System.out.printf("%3d", Integer.parseInt(array[i][j]));
				}
				if ((j + 1) % ((2 * n) - 1) == 0) {
					System.out.println();
				}

			}
		}

	}
}
