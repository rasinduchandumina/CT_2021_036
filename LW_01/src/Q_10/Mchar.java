import java.util.Scanner;

public class Mchar {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an odd-length word
        System.out.print("Enter an odd-length word: ");
        String input = scanner.nextLine();

        // Ensure the input length is odd
        if (input.length() % 2 != 0) {
            // Find the middle index
            int middleIndex = input.length() / 2;

            // Get the middle character
            char middleChar = input.charAt(middleIndex);

            // Output the middle character
            System.out.println("Middle character: " + middleChar);
        } else {
            System.out.println("Please enter a word with an odd length.");
        }
    }
}
