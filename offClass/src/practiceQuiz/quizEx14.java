package practiceQuiz;

/*
 * �e���� 
 * n = ���X�Ӫ��L
 * from = �_�ϬW�l
 * to = �ؼЬW�l 
 * 
 */

class acting{
	void TowerOfHanoi(int n, int from, int to) {
		if(n==1) {
			System.out.printf("�q%d���W���ʨ�%d���W\n",from,to);
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