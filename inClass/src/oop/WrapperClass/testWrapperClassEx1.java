package oop.WrapperClass;

public class testWrapperClassEx1 {

	public static void main(String[] args) {
		String num = "12345";
		System.out.println(num+1);
		
		int number1 = Integer.parseInt(num);
		
		Integer numInt = new Integer(num);
		
		System.out.println(numInt+1);
		System.out.println(number1+1);
		
		int value = 7;				 
		Integer k = value;			//Integer k = new Integer(value);
		int value1 = k;				//int value1 = k.intValue;
		System.out.println(k++);
		
		
		

	}

}
