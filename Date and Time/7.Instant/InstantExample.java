import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {
    public static void main(String[] args) {
        // Creating an Instant representing the current moment in UTC
        Instant currentInstant = Instant.now();
        System.out.println("Current Instant in UTC: " + currentInstant);

        // Creating an Instant representing a specific moment
        Instant specificInstant = Instant.ofEpochSecond(1609459200); // January 1, 2021, 00:00:00 UTC
        System.out.println("Specific Instant: " + specificInstant);

        // Accessing the epoch seconds and nanoseconds of an Instant
        long epochSeconds = currentInstant.getEpochSecond();
        int nano = currentInstant.getNano();
        System.out.println("Epoch Seconds: " + epochSeconds + ", Nanoseconds: " + nano);

        // Creating an Instant from epoch seconds and nanoseconds
        Instant customInstant = Instant.ofEpochSecond(1000000000, 500000000);
        System.out.println("Custom Instant: " + customInstant);

        // Performing operations on Instant
        Instant futureInstant = currentInstant.plus(7, ChronoUnit.DAYS);
        System.out.println("Instant after 7 days: " + futureInstant);

        // Comparing Instant objects
        if (currentInstant.isAfter(specificInstant)) {
            System.out.println("The current instant is after the specific instant.");
        } else {
            System.out.println("The current instant is on or before the specific instant.");
        }
    }
}
