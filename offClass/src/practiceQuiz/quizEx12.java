package practiceQuiz;

/*
 * 洗牌程式
 */



/*
 * 方法一
 * 
 */

class setDeck1 {
	String[] color = { "黑桃", "愛心", "方塊", "梅花" };
	String[] number = { " A", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K" };
	String[] deck = new String[52];
	int[] deckCount = new int[52];

	setDeck1() {
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
				System.out.println(
						"------------------------------------------------------------------------------------------------------");
			}
		}

	}

}

/*
 * 方法2
 */

class setDeck2 {
	String[] color2 = { "黑桃", "愛心", "方塊", "梅花" };
	String[] number2 = { " A", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K" };
	String[] deck2 = new String[52];

	setDeck2() {
		for (int j = 0; j < color2.length; j++) {
			for (int i = 0; i < number2.length; i++) {
				deck2[i + 13 * j] = color2[j] + " " + number2[i] + "\t";
			}
		}
	}

	void getDeckb() {
		for (int i = 0; i < 10000; i++) {
			String temp;
			int a1 = (int) (Math.random() * 52);
			int a2 = (int) (Math.random() * 52);
			temp = deck2[a1];
			deck2[a1] = deck2[a2];
			deck2[a2] = temp;
		}
		
		for(int i = 0;i<deck2.length;i++) {
			System.out.print(deck2[i]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
				System.out.println("------------------------------------------------------------------------------------------------------");
			}
		}

		
	}
}

public class quizEx12 {

	public static void main(String[] args) {

		setDeck1 action = new setDeck1();
		System.out.println("方法1");
		System.out.println("\n\n");
		action.getDeck();
		System.out.println("\n\n");
		System.out.println("方法2");
		System.out.println("\n\n");
		setDeck2 action2 = new setDeck2();
		action2.getDeckb();

	}
}