package conditionalPractice;

public class TestIfElseIfHw {

	public static void main(String[] args) {
		int year = (int)(Math.random()*3000);
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					if(year%4000==0) {
						System.out.println(year + "不是??�年");
					}else {
						System.out.println(year + "?��??�年");
					}
				}else {
					System.out.println(year + "不是??�年");
				}
			}else {
				System.out.println(year + "?��??�年");
			}
		}else {
			System.out.println(year + "不是??�年");
		}
		
		
		int year2 = (int)(Math.random()*3000);
		if (((year2%4 == 0)&&(year2%100 !=0))||(year2%400 ==0)) {
			System.out.println("西�??" + year2 + "?��??�年");
		}else {
			System.out.println("西�??" + year2 + "不是??�年");
		}
		
		
		
		
		int index = (int)(Math.random()*2+1);
		int degree = (int)(Math.random()*100-50);
		double k = 9/5.0;
		if (index==1) {
			System.out.println("index=" + index + "\n??��?�溫�?" + degree + "=?��氏溫�?" + (degree*k+32));
		}else if(index==2) {
			System.out.println("index=" + index + "\n?��氏溫�?" + degree + "=??��?�溫�?" + ((degree-32)/k));
		}

	}

}