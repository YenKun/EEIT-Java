package practiceQuiz;

interface A{
	void doAStuff();
}
interface B extends A{
	void doBStuff();
}
interface C extends A ,B{	//�h���~��?
	void doCstuff();
}

interface C1 extends A,C{
	void doC1Stuff();
}

class a {
	
}

class b extends a{
	
}



class D implements C1,A,B,C{

	@Override
	public void doAStuff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doBStuff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doCstuff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doC1Stuff() {
		// TODO Auto-generated method stub
		
	}
	
}

public class quizEx{
	public static void main(String [] args) {

		
		





	}
}
