package practiceClassObjext;

public class ConstructorPracticeEx1 {
	/*
	 *����ƻP�غc�� 
	 */
	
	public static void main(String[] args) {
		class Clothes {
			String color;
			char size;
			int num;

			Clothes(String color, char size, int num) {
				this.color = color;
				this.size = size;
				this.num = num;
			}
		}
		Clothes a = new Clothes("red", 'M', 24601);
		Clothes b = new Clothes("green", 'S', 24602);
		Clothes c = new Clothes("yellow", 'L', 24603);
		
		System.out.printf("a�����~�s����%d,�C�⬰%s,�j�p��%c\n",a.num,a.color,a.size);
		System.out.printf("b�����~�s����%d,�C�⬰%s,�j�p��%c\n",b.num,b.color,b.size);
		System.out.printf("c�����~�s����%d,�C�⬰%s,�j�p��%c\n",c.num,c.color,c.size);
	}
}
