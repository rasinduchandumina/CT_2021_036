import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height / 100.0, 2);
        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi >= 20 && bmi <= 25) {
            System.out.println("Your BMI is considered 'normal'.");
        } else if (bmi < 20) {
            System.out.println("Your BMI is considered 'underweight'.");
        } else {
            System.out.println("Your BMI is considered 'overweight'.");
        }
        scanner.close();
    }
}