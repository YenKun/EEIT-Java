package oopMethod;

class shirt{
	int price;
	char size;
	
	shirt(int price,char size){
		this.price=price;
		this.size = size;
	}
}

public class testNewLocationEx1 {

	public static void main(String[] args) {
		shirt myShirt = new shirt(2000,'S');
		shirt yourShirt = new shirt(3000,'L');
		
		System.out.println(myShirt);
		System.out.println(myShirt.price + " " + myShirt.size);
		System.out.println(yourShirt);
		System.out.println(yourShirt.price + " " + yourShirt.size);
		
		myShirt = yourShirt;
		
		boolean k = (myShirt == yourShirt);
		System.out.println(k);
		
		myShirt.price = 30000;
		myShirt.size = 'X';
		System.out.println(yourShirt);
		System.out.println(yourShirt.price + " " + yourShirt.size);
		
		yourShirt = new shirt(600,'G');
		System.out.println(yourShirt);
		System.out.println(yourShirt.price + " " + yourShirt.size);
		

	}

}
