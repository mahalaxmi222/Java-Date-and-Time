import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneIdExample {
    public static void main(String[] args) {
        // Getting the default time zone of the system
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println("Default Time Zone: " + defaultZone);

        // Creating a LocalDateTime object
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 1, 12, 30, 0);

        // Converting LocalDateTime to ZonedDateTime with the default time zone
        ZonedDateTime zonedDateTimeDefault = ZonedDateTime.of(localDateTime, defaultZone);
        System.out.println("ZonedDateTime with Default Time Zone: " + zonedDateTimeDefault);

        // Creating a ZoneId for a specific time zone (e.g., New York)
        ZoneId newYorkZone = ZoneId.of("America/New_York");

        // Converting LocalDateTime to ZonedDateTime with the New York time zone
        ZonedDateTime zonedDateTimeNewYork = ZonedDateTime.of(localDateTime, newYorkZone);
        System.out.println("ZonedDateTime with New York Time Zone: " + zonedDateTimeNewYork);

        // Formatting ZonedDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
        String formattedDateTimeNewYork = zonedDateTimeNewYork.format(formatter);
        System.out.println("Formatted Date and Time in New York: " + formattedDateTimeNewYork);
    }
}
