import java.time.Duration;
import java.time.Instant;

public class DurationExample {
    public static void main(String[] args) {
        // Creating an Instant representing the start time
        Instant startTime = Instant.now();

        // Simulating some time-consuming operation
        simulateTimeConsumingOperation();

        // Creating an Instant representing the end time
        Instant endTime = Instant.now();

        // Calculating the duration between start and end times
        Duration duration = Duration.between(startTime, endTime);

        // Retrieving the duration in seconds and milliseconds
        long seconds = duration.getSeconds();
        long millis = duration.toMillis();

        System.out.println("Duration in seconds: " + seconds);
        System.out.println("Duration in milliseconds: " + millis);
    }

    private static void simulateTimeConsumingOperation() {
        // Simulating a time-consuming operation
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
