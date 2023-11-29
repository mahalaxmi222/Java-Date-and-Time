import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class OffsetTimeExample {
    public static void main(String[] args) {
        // Creating an OffsetTime object representing the current time with a specific offset
        ZoneOffset offset = ZoneOffset.ofHours(-5); // Offset of -5 hours from UTC
        OffsetTime currentOffsetTime = OffsetTime.now().withOffsetSameInstant(offset);
        System.out.println("Current Offset Time: " + currentOffsetTime);

        // Creating an OffsetTime object for a specific time with a specific offset
        OffsetTime specificOffsetTime = OffsetTime.of(12, 30, 0, 0, offset);
        System.out.println("Specific Offset Time: " + specificOffsetTime);

        // Accessing individual components of an OffsetTime
        int hour = currentOffsetTime.getHour();
        int minute = currentOffsetTime.getMinute();
        int second = currentOffsetTime.getSecond();
        ZoneOffset currentOffset = currentOffsetTime.getOffset();
        System.out.println("Hour: " + hour + ", Minute: " + minute + ", Second: " + second +
                ", Offset: " + currentOffset);

        // Formatting OffsetTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss Z");
        String formattedOffsetTime = currentOffsetTime.format(formatter);
        System.out.println("Formatted Offset Time: " + formattedOffsetTime);

        // Performing operations on OffsetTime
        OffsetTime futureOffsetTime = currentOffsetTime.plusHours(2);
        System.out.println("Offset Time after 2 hours: " + futureOffsetTime);

        // Comparing OffsetTime objects
        if (currentOffsetTime.isEqual(specificOffsetTime)) {
            System.out.println("The current offset time is equal to the specific offset time.");
        } else {
            System.out.println("The current offset time is not equal to the specific offset time.");
        }
    }
}
