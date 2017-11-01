package oop.enumeratedtype;

enum Poker{
	Spade,Heart,Diamond,Club
}



public class testEnumeratedTypeEx1 {

	public static void main(String[] args) {
		
		Poker suit = Poker.Club;
		
		switch(suit) {
		
		case Club :
			System.out.println(Poker.Club);
			break;
		case Diamond :
			System.out.println(Poker.Diamond);
			break;
		case Heart :
			System.out.println(Poker.Heart);
			break;
		case Spade :
			System.out.println(Poker.Spade);
			break;
		default :
			assert false : "impossible";
			break;
		
		}
		
			

	}

}
