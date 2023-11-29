import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekExample {
    public static void main(String[] args) {
        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Getting the day of the week from the current date
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println("Day of the Week: " + dayOfWeek);

        // Checking if it's the weekend (Saturday or Sunday)
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }

        // Getting the next Monday from the current date
        LocalDate nextMonday = currentDate.plusDays(DayOfWeek.MONDAY.getValue() - dayOfWeek.getValue() + 7);
        System.out.println("Next Monday: " + nextMonday);
    }
}
