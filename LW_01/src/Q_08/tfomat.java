import java.util.Scanner;

public class tfomat {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string containing a single exclamation mark
        System.out.print("Enter a string containing a single exclamation mark: ");
        String input = scanner.nextLine();

        // Find the position of the exclamation mark
        int exclamationIndex = input.indexOf('!');

        // If the exclamation mark is found, split the string into two parts
        if (exclamationIndex != -1) {
            String beforeExclamation = input.substring(0, exclamationIndex).trim();
            String afterExclamation = input.substring(exclamationIndex + 1).trim();

            // Output the two parts without the exclamation mark
            System.out.println("Before exclamation mark: " + beforeExclamation);
            System.out.println("After exclamation mark: " + afterExclamation);
        } else {
            // If no exclamation mark is found, output an error message
            System.out.println("The input string does not contain an exclamation mark.");
        }
    }
}
