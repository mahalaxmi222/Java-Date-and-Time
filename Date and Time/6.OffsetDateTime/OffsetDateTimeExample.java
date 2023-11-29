import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeExample {
    public static void main(String[] args) {
        // Creating an OffsetDateTime object representing the current date and time with a specific offset
        ZoneOffset offset = ZoneOffset.ofHours(-5); // Offset of -5 hours from UTC
        OffsetDateTime currentOffsetDateTime = OffsetDateTime.now().withOffsetSameInstant(offset);
        System.out.println("Current Offset Date and Time: " + currentOffsetDateTime);

        // Creating an OffsetDateTime object for a specific date and time with a specific offset
        OffsetDateTime specificOffsetDateTime = OffsetDateTime.of(2023, 1, 1, 12, 30, 0, 0, offset);
        System.out.println("Specific Offset Date and Time: " + specificOffsetDateTime);

        // Accessing individual components of an OffsetDateTime
        int year = currentOffsetDateTime.getYear();
        int month = currentOffsetDateTime.getMonthValue();
        int day = currentOffsetDateTime.getDayOfMonth();
        int hour = currentOffsetDateTime.getHour();
        int minute = currentOffsetDateTime.getMinute();
        int second = currentOffsetDateTime.getSecond();
        ZoneOffset currentOffset = currentOffsetDateTime.getOffset();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day +
                ", Hour: " + hour + ", Minute: " + minute + ", Second: " + second +
                ", Offset: " + currentOffset);

        // Formatting OffsetDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
        String formattedOffsetDateTime = currentOffsetDateTime.format(formatter);
        System.out.println("Formatted Offset Date and Time: " + formattedOffsetDateTime);

        // Performing operations on OffsetDateTime
        OffsetDateTime futureOffsetDateTime = currentOffsetDateTime.plusDays(7).minusHours(3);
        System.out.println("Offset Date and Time after 7 days and 3 hours: " + futureOffsetDateTime);

        // Comparing OffsetDateTime objects
        if (currentOffsetDateTime.isEqual(specificOffsetDateTime)) {
            System.out.println("The current offset date and time is equal to the specific offset date and time.");
        } else {
            System.out.println("The current offset date and time is not equal to the specific offset date and time.");
        }
    }
}
