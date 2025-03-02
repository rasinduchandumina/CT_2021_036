import javax.swing.*;

public class myfname {
    public static void main(String[] args) {
        // Create a frame with the title "My First Frame"
        JFrame frame = new JFrame("My First Frame");

        // Set the size of the frame (300 pixels wide, 200 pixels high)
        frame.setSize(300, 200);

        // Position the frame with its top-left corner at (50, 100) on the screen
        frame.setLocation(100, 50);

        // Set the default close operation to exit the program when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
