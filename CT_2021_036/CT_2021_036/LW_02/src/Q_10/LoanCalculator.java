import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MONTHS_IN_YEAR = 12;

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan period (in years): ");
        int loanPeriod = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / MONTHS_IN_YEAR;
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Payment: %.2f%n", totalPayment);
        scanner.close();
    }
}