package oopMethod;

public class testStringEx2 {

	public static void main(String[] args) {
		String data = "mary-john-jacky-putin-tim";
		String[] value = data.split("-");
		for (String x : value) {
			System.out.println(x);
		}

	}

}
