import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        // Creating a LocalDateTime object
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 1, 12, 30, 0);

        // Creating a DateTimeFormatter for a custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Formatting LocalDateTime using the formatter
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Parsing a String to LocalDateTime using the formatter
        String dateString = "2023-01-01 14:45:30";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);

        // Creating a DateTimeFormatter with a predefined formatter (ISO_LOCAL_DATE_TIME)
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String isoFormattedDateTime = localDateTime.format(isoFormatter);
        System.out.println("ISO Formatted Date and Time: " + isoFormattedDateTime);
    }
}
