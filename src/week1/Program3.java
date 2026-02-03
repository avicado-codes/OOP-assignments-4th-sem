// write a java program to convert Celsius to Fahrenheit and vice versa

package week1;
import java.util.*;

class TemperatureConverter{
    public double toFahrenheit(double celsius){
        return (celsius * 9.0/5) + 32;
    }
    public double toCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}

public class Program3 {
    public static void main(String[] args){
        // objects
        Scanner input = new Scanner(System.in);
        TemperatureConverter tempConverter = new TemperatureConverter();

        System.out.print("Enter the temperature value: ");
        double tempVal = input.nextDouble();

        System.out.print("Enter 'c'/'C' for Celsius and 'f'/'F' for Fahrenheit: ");
        char unit = input.next().charAt(0);

        if (unit == 'C' || unit == 'c') {
            System.out.println("In Fahrenheit: " + tempConverter.toFahrenheit(tempVal));
        } else if (unit == 'F' || unit == 'f') {
            System.out.println("In Celsius: " + tempConverter.toCelsius(tempVal));
        } else {
            System.out.println("Invalid unit entered.");
        }

        input.close();
    }
}
