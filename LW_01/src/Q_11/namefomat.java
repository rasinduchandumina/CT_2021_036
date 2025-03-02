import java.util.Scanner;

public class namefomat {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their full name (first middle last)
        System.out.print("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine();

        // Split the full name into an array of words (first, middle, last)
        String[] nameParts = fullName.split(" ");

        // Ensure the name has exactly three parts: first, middle, and last
        if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            // Get the first letter of the middle name
            char middleInitial = middleName.charAt(0);

            // Format and print the name in the desired format: last, first middle-initial.
            System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
        } else {
            System.out.println("Please enter your full name in the format: first middle last.");
        }
    }
}
