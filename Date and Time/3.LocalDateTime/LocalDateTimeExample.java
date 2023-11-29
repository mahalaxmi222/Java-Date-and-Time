import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Creating a LocalDateTime object representing the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Creating a LocalDateTime object for a specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 1, 1, 12, 30, 0);
        System.out.println("Specific Date and Time: " + specificDateTime);

        // Accessing individual components of a LocalDateTime
        int year = currentDateTime.getYear();
        int month = currentDateTime.getMonthValue();
        int day = currentDateTime.getDayOfMonth();
        int hour = currentDateTime.getHour();
        int minute = currentDateTime.getMinute();
        int second = currentDateTime.getSecond();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day +
                ", Hour: " + hour + ", Minute: " + minute + ", Second: " + second);

        // Formatting LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Performing operations on LocalDateTime
        LocalDateTime futureDateTime = currentDateTime.plusDays(7).minusHours(3);
        System.out.println("Date and Time after 7 days and 3 hours: " + futureDateTime);

        // Comparing LocalDateTime objects
        if (currentDateTime.isEqual(specificDateTime)) {
            System.out.println("The current date and time is equal to the specific date and time.");
        } else {
            System.out.println("The current date and time is not equal to the specific date and time.");
        }
    }
}
