import java.util.Scanner;

public class strinfo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calculate the length of the string
        int length = input.length();

        // Get the first and last characters
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(length - 1);

        // Output the results
        System.out.println(length);
        System.out.println(firstChar);
        System.out.println(lastChar);
    }
}
