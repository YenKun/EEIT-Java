package practiceClassObjext;

public class ConstructorPracticeEx1 {
	/*
	 *實體化與建構式 
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
		
		System.out.printf("a的產品編號為%d,顏色為%s,大小為%c\n",a.num,a.color,a.size);
		System.out.printf("b的產品編號為%d,顏色為%s,大小為%c\n",b.num,b.color,b.size);
		System.out.printf("c的產品編號為%d,顏色為%s,大小為%c\n",c.num,c.color,c.size);
	}
}
