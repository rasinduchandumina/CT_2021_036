import javax.swing.*;

public class WelcomeFrame {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Welcome to Java");

        // Set the size of the frame
        frame.setSize(800, 600);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
