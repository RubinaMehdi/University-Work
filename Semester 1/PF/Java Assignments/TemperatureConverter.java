public class TemperatureConverter {
public static void main(String[] args) {

double celsius = 32;
System.out.println("Temperature in Celsius: " + celsius + " °C");


double fahrenheit = (9.0 / 5.0 * celsius) + 32;
System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");


double kelvin = celsius + 273.15;
	
System.out.println("Temperature in Kelvin: " + kelvin + " K");
      	  }
}

