import java.text.SimpleDateFormat;
import java.util.Date;

public class timedate_2 {
    public static void main(String[] args) {
        // Create an instance of Date class to get the current date and time
        Date currentDate = new Date();

        // Define the desired format
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMM dd, yyyy");

        // Format the current date and print it to the console
        System.out.println(dateFormat.format(currentDate));
    }
}
