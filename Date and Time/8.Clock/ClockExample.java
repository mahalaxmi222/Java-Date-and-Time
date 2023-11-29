import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class ClockExample {
    public static void main(String[] args) {
        // Creating a Clock for the system default time zone
        Clock systemClock = Clock.systemDefaultZone();

        // Retrieving the current instant using the system clock
        Instant currentInstant = Instant.now(systemClock);
        System.out.println("Current Instant using System Clock: " + currentInstant);

        // Creating a Clock for a specific time zone
        ZoneId zoneId = ZoneId.of("America/New_York");
        Clock zoneClock = Clock.system(zoneId);

        // Retrieving the current instant using the clock with a specific time zone
        Instant currentInstantInTimeZone = Instant.now(zoneClock);
        System.out.println("Current Instant in New York: " + currentInstantInTimeZone);

        // Retrieving the current time in milliseconds using the clock
        long currentTimeMillis = Clock.systemUTC().millis();
        System.out.println("Current Time in Milliseconds using UTC Clock: " + currentTimeMillis);
    }
}
