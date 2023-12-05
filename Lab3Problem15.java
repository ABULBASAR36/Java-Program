//import java.util.Date;
//import java.text.SimpleDateFormat;
public class Lab3Problem15 {
    public static void main(String[] args) {
       /*  Date currentDate = new Date();

        // Define the format for displaying the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");

        // Format and display the current date and time
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Current Date and Time: " + formattedDate);*/
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    }
}
