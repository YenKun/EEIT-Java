package practiceLoopQuiz;

/*
 * 洗牌程式
 */

class setDeck {
	String[] color = { "黑桃", "愛心", "方塊", "梅花" };
	String[] number = { " A", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K" };
	String[] deck = new String[52];
	int[] deckCount = new int[52];

	setDeck() {
		for (int j = 0; j < color.length; j++) {
			for (int i = 0; i < number.length; i++) {
				deck[i + 13 * j] = color[j] + " " + number[i] + "\t";
			}
		}
	}

	void getDeck() {
		int finalNum = 0;
		for (int i = 0; i < deck.length; i++) {
			while (true) {
				int j = (int) (Math.random() * 52);
				if (deckCount[j] == 0) {
					finalNum = j;
					deckCount[j]++;
					break;
				}

			}

			System.out.print(deck[finalNum]);

			if ((i + 1) % 13 == 0) {
				System.out.println();
				System.out.println("------------------------------------------------------------------------------------------------------");
			}
		}

	}

}

public class quizEx12 {

	public static void main(String[] args) {

		setDeck action = new setDeck();
		action.getDeck();

	}
}