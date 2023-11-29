import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        // Creating a ZoneOffset for a specific offset (e.g., UTC+03:00)
        ZoneOffset offset = ZoneOffset.ofHours(3);

        // Creating a LocalDateTime object
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 1, 12, 30, 0);

        // Converting LocalDateTime to OffsetDateTime with the specific offset
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println("OffsetDateTime with UTC+03:00: " + offsetDateTime);

        // Accessing the offset value
        ZoneOffset retrievedOffset = offsetDateTime.getOffset();
        System.out.println("Offset value: " + retrievedOffset);

        // Formatting OffsetDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
        String formattedDateTime = offsetDateTime.format(formatter);
        System.out.println("Formatted Date and Time with Offset: " + formattedDateTime);
    }
}
