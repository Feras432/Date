import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        // Current date
        Date toDae = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy ss:mm:HH");
        String newDae = formatter.format(toDae);
        System.out.println("New Dae: " + newDae);

        // Adding 5 days
        GregorianCalendar gcal = new GregorianCalendar();
        Calendar california = Calendar.getInstance();
        california.setTime(toDae);
        california.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = california.getTime();

        // Future date
        String formattedFutureDate = formatter.format(futureDate);
        System.out.println("Date after 5 days: " + formattedFutureDate);
        System.out.println("Gregorian date: " + gcal.getTime());
    }
}