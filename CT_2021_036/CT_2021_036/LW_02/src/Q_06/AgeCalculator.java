import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year you were born: ");
        int birthYear = scanner.nextInt();

        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;

        String verb = (age > 0) ? "are" : "will be";
        System.out.println("You were born in " + birthYear + " and " + verb + " " + Math.abs(age) + " this year.");
        scanner.close();
    }
}