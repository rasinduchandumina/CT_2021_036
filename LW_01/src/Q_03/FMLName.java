import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class FMLName {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first, middle, and last name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Extract middle initial and format the name
        String middleInitial = middleName.substring(0, 1).toUpperCase() + ".";
        String fullName = firstName + " " + middleInitial + " " + lastName;

        // Create a frame with user's formatted full name as the title
        JFrame frame = new JFrame(fullName);

        // Set the size of the frame
        frame.setSize(800, 600);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Create a panel with a GridBagLayout to center the label
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);

        // Create a label with a welcome message
        JLabel label = new JLabel("Welcome, " + fullName + "!");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.BLUE);

        // Add label to panel at the center
        panel.add(label, new GridBagConstraints());

        // Make the frame visible
        frame.setVisible(true);
    }
}