import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class Lab3Problem16 {
    public static void main(String[] args) {
        /* // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define the format for displaying the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

        // Format and display the current date and time
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Now: " + formattedDateTime);*/
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
    }
}
