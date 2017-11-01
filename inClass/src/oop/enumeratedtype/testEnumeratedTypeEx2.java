package oop.enumeratedtype;

enum Weather {
	Sunny("Hot"), Cloudy("Dark"), Stormy, Windy;

	String status = "light";

	Weather() {
		System.out.println("Good day");
	}

	Weather(String status) {
		this.status = status;
	}

	void showWeather() {
		System.out.println("Status:" + status);
	}
}

public class testEnumeratedTypeEx2 {

	public static void main(String[] args) {
		Weather day1 = Weather.Sunny;
		day1.showWeather();
		Weather day2 = Weather.Cloudy;
		day2.showWeather();
		Weather.Stormy.showWeather();

	}

}
