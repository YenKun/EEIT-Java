package practiceQuiz;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//test Serializable


class add implements Serializable{
	private static final long serialVersionUID = 1;
	private int sum = 0;
	public void calc(int...c) {
		for(int i = 0;i<c.length;i++) {
			sum+=c[i];
		}
	}
	public int getSum() {
		return sum;
	}
	
}
class save{
	public void write() throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		add a = new add();
		a.calc(1,2,3,4);
		String path = "E:/test.ser";
		fos = new FileOutputStream(path);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		System.out.println("successfully");
		oos.close();
		fos.close();
		
		
		
		
		
		
	}
}

public class quizExEx16 {

	public static void main(String[] args) throws IOException {
		new save().write();
		

	}
}