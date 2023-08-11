package _6TheTemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit:");
		double fahrenheit =scan.nextDouble();
		scan.close();
		TemperatureConverter temperatureconverter=new TemperatureConverter();
		double celsius = temperatureconverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(celsius);
		
	}
	


}
