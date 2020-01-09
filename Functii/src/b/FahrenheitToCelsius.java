package b;
import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        System.out.println("Please introduce temperature in Fahrenheit");
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        convertFarToCel(fahrenheit);
    }

    public static double convertFarToCel(double fahrenheit) {
        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Your body temperature in Celsius degrees is " + celsius);
        if (celsius > 37) {
            System.out.println("You are ill!");
        }
        return celsius;
    }
}
