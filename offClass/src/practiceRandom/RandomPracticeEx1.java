package practiceRandom;
class Books{
	String title;
	String author;
}

public class RandomPracticeEx1 {

	public static void main(String[] args) {
		Books[] myBooks = new Books[] {new Books(),new Books()};
		Books[] eBooks=myBooks;
		int x = 0;
//		myBooks[0] = new Books();
//		myBooks[1] = new Books();
//		myBooks[2] = new Books();
//		eBooks[0]= myBooks[1];
//		
		myBooks[0].title="000";
		myBooks[1].title="111";
		myBooks[2].title="222";
		
		

				

	}

}