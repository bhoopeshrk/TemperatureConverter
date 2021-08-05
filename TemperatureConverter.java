import java.io.*;

public class TemperatureConverter {
    public static void main(String args[]) throws Exception
    {
        System.out.println("Celsius to Fahrenheit \n------- -- ----------");
        System.out.print("Enter temperature in Celsius : ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        float celsius = Float.parseFloat(input.readLine());
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "\u00B0C = " + fahrenheit + "\u00B0F");

        System.out.println("\nCelsius to Kelvin \n------- -- ------");
        System.out.print("Enter temperature in Celsius : ");
        BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
        double celsius1 = Double.parseDouble(input1.readLine());
        double kelvin = celsius1 + 273.15;
        System.out.println(celsius + "\u00B0C = " + kelvin + "K");

        System.out.println("\nFahrenheit to Celsius \n---------- -- -------");
        System.out.print("Enter temperature in Fahrenheit : ");
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        float fahrenheit1 = Float.parseFloat(input2.readLine());
        float celsius2 = (fahrenheit1 - 32) * 5 / 9;
        System.out.println(fahrenheit1 + "\u00B0F = " + celsius2 + "\u00B0C");

        System.out.println("\nFahrenheit to Kelvin \n---------- -- ------");
        System.out.print("Enter temperature in Fahrenheit : ");
        BufferedReader input3 = new BufferedReader(new InputStreamReader(System.in));
        double fahrenheit2 = Double.parseDouble(input3.readLine());
        double kelvin1 = (fahrenheit2 - 32) * 5 / 9 + 273.15;
        System.out.println(fahrenheit1 + "\u00B0F = " + kelvin1 + "K");

        System.out.println("\nKelvin to Celsius \n------ -- -------");
        System.out.print("Enter temperature in Kelvin : ");
        BufferedReader input4 = new BufferedReader(new InputStreamReader(System.in));
        double kelvin2 = Double.parseDouble(input4.readLine());
        double celsius3 = kelvin2 - 273.15;
        System.out.println(kelvin2 + "K = " + celsius3 + "\u00B0C");

        System.out.println("\nKelvin to Fahrenheit \n------ -- ----------");
        System.out.print("Enter temperature in Kelvin : ");
        BufferedReader input5 = new BufferedReader(new InputStreamReader(System.in));
        double kelvin3 = Double.parseDouble(input5.readLine());
        double fahrenheit3 = (kelvin3 - 273.15) * 9 / 5 + 32;
        System.out.println(kelvin2 + "K = " + fahrenheit3 + "\u00B0F");
    }
}
