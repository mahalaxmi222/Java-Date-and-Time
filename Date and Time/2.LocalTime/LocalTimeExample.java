import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Creating a LocalTime object representing the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Creating a LocalTime object for a specific time
        LocalTime specificTime = LocalTime.of(12, 30, 0);
        System.out.println("Specific Time: " + specificTime);

        // Accessing individual components of a LocalTime
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        System.out.println("Hour: " + hour + ", Minute: " + minute + ", Second: " + second);

        // Performing operations on LocalTime
        LocalTime futureTime = currentTime.plusHours(2);
        System.out.println("Time after 2 hours: " + futureTime);

        // Comparing LocalTime objects
        if (currentTime.isBefore(specificTime)) {
            System.out.println("The current time is before the specific time.");
        } else {
            System.out.println("The current time is after or equal to the specific time.");
        }
    }
}
