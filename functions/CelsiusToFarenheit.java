package functions;

public class CelsiusToFarenheit {
	public static void main(String[] args) {
		float celsius=10.5f;
		System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(10.5f));

	}
	public static float celsiusToFahrenheit(float celsius) {
		float fahrenheit=(celsius*9/5)+32;
		return fahrenheit;
	}

	//using double and static:
//	public static void main(String[] args) {
//		double celsius=10.5f;
//	System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(25));
//	}
//	public  static double celsiusToFahrenheit(double celsius) {
//		double fahrenheit=(celsius*9/5)+32;
//		return fahrenheit;
//	}
}
