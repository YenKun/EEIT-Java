package oop.Encapulation;

class testEncapulation{
	public int a = 1;
	//private int b = 1; 
}

public class testCallEncapulationEx1 {

	public static void main(String[] args) {
		
		testEncapulation action = new testEncapulation();
		System.out.println(action.a);
//		System.out.println(action.b);

	}

}
