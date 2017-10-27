package practiceQuiz;

/*
 * 河內塔 
 * n = 有幾個金盤
 * from = 起使柱子
 * to = 目標柱子 
 * 
 */

class acting{
	void TowerOfHanoi(int n, int from, int to) {
		if(n==1) {
			System.out.printf("從%d號柱移動到%d號柱\n",from,to);
		}else {
			int borrow = 6-from-to;
			TowerOfHanoi(n-1,from,borrow);
			TowerOfHanoi(1,from,to);
			TowerOfHanoi(n-1,borrow,to);
		}
		
	}
	
	 
}

public class quizEx14 {

	public static void main(String[] args) {
		acting H = new acting();
		H.TowerOfHanoi(2,1,2);



	}
}
