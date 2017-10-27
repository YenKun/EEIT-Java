package practiceQuiz;



public class quizEx15 {

	public static void main(String[] args) {

		int[][] chess = new int[8][8];
		int[][] chessCount = new int[12][12];
		int X = 3;
		int Y = 3;
		int prevX = 0;
		int prevY = 0;
		chess[X][Y] = 1;	
	
		for(int i=2;i<10;i++) {
			for(int j=2;j<10;j++) {
				chessCount[i][j] = 1;
			}
		}
		
		chessCount[X+2][Y+2] = 0;

		for (int i = 0; i < 25; i++) {

			while (true) {
				int moveX = (int) (Math.random() * 2 + 1);
				int moveY;
				if (moveX == 2) {
					moveY = moveX - 1;
				} else {
					moveY = moveX + 1;
				}

				int coin = (int) (Math.random() * 2);
				if (coin == 0) {
					moveX = -(moveX);
				}
				coin = (int) (Math.random() * 2);
				if (coin == 0) {
					moveY = -(moveY);
				}

				if (((X + moveX) < 8 && (X + moveX) >= 0) && ((Y + moveY) < 8 && (Y + moveY) >= 0)
						&& chess[X + moveX][Y + moveY] == 0) {
					chess[X + moveX][Y + moveY] = chess[X][Y] + 1;
					prevX = X;
					prevY = Y;
					X = X + moveX;
					Y = Y + moveY;
					chessCount[X+2][Y+2] =0;
					break;
				}else if(chessCount[X+4][Y+3]==0&&chessCount[X+4][Y-3]==0&&chessCount[X-4][Y+3]==0&&chessCount[X-4][Y-3]==0&&chessCount[X+3][Y+4]==0&&chessCount[X+3][Y-4]==0&&chessCount[X-3][Y+4]==0&&chessCount[X-3][Y-4]==0){
					chess[X][Y]=0;
					chessCount[X+2][Y+2] =1;
					X = prevX;
					Y = prevY;
					
				}

			}

		}

		for (int a[] : chess) {
			for (int b : a) {
				System.out.printf("%2d ", b);
			}
			System.out.println();
		}

	}
}
