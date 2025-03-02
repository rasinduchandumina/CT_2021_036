import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeframe {
    public static void main(String[] args) {
        // Create a SimpleDateFormat object to format the current time
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");

        // Get the current time
        String currentTime = timeFormat.format(new Date());

        // Create the frame with the current time as the title
        JFrame frame = new JFrame("Current Time: " + currentTime);

        // Set the size of the frame (arbitrary dimensions)
        frame.setSize(300, 200);

        // Set the default close operation so the program exits when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
