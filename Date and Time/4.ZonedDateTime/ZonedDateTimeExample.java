import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // Creating a ZonedDateTime object for the current date and time in a specific time zone
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println("Current Date and Time in New York: " + currentZonedDateTime);

        // Creating a ZonedDateTime object for a specific date and time in a specific time zone
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 1, 12, 30, 0);
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println("Specific Date and Time in New York: " + specificZonedDateTime);

        // Accessing individual components of a ZonedDateTime
        int year = currentZonedDateTime.getYear();
        int month = currentZonedDateTime.getMonthValue();
        int day = currentZonedDateTime.getDayOfMonth();
        int hour = currentZonedDateTime.getHour();
        int minute = currentZonedDateTime.getMinute();
        int second = currentZonedDateTime.getSecond();
        ZoneId zone = currentZonedDateTime.getZone();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day +
                ", Hour: " + hour + ", Minute: " + minute + ", Second: " + second +
                ", Zone: " + zone);

        // Formatting ZonedDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedZonedDateTime = currentZonedDateTime.format(formatter);
        System.out.println("Formatted Date and Time in New York: " + formattedZonedDateTime);

        // Performing operations on ZonedDateTime
        ZonedDateTime futureZonedDateTime = currentZonedDateTime.plusDays(7).minusHours(3);
        System.out.println("Date and Time in New York after 7 days and 3 hours: " + futureZonedDateTime);

        // Comparing ZonedDateTime objects
        if (currentZonedDateTime.isEqual(specificZonedDateTime)) {
            System.out.println("The current date and time in New York is equal to the specific date and time.");
        } else {
            System.out.println("The current date and time in New York is not equal to the specific date and time.");
        }
    }
}
