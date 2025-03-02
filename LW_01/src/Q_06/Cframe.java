import javax.swing.*;
import java.util.Scanner;

public class Cframe {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the width, height, and title of the frame
        System.out.print("Enter the width of the frame (W): ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the frame (H): ");
        int height = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character after the integer input

        System.out.print("Enter the title of the frame: ");
        String title = scanner.nextLine();

        // Create the frame with the specified title
        JFrame frame = new JFrame(title);

        // Set the size of the frame
        frame.setSize(width, height);

        // Set the default close operation so the program exits when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
