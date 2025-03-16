import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (1.8 * celsius) + 32;
        System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit%n", celsius, fahrenheit);
        scanner.close();
    }
}