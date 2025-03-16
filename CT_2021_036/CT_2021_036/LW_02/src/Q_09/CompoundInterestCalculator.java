import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (R) in percentage: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years (N): ");
        int years = scanner.nextInt();

        double futureValue = principal * Math.pow(1 + (rate / 100), years);
        System.out.printf("The future value of your investment after %d years is: %.2f%n", years, futureValue);
        scanner.close();
    }
}