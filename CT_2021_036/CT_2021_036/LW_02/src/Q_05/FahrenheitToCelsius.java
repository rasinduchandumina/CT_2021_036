import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius%n", fahrenheit, celsius);
        scanner.close();
    }
}