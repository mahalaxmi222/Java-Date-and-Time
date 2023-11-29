import java.time.MonthDay;
import java.time.LocalDate;

public class MonthDayExample {
    public static void main(String[] args) {
        // Creating a MonthDay object for a specific month and day
        MonthDay birthday = MonthDay.of(5, 23); // May 23rd

        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Checking if the current date matches the specified MonthDay
        if (currentDate.getMonthValue() == birthday.getMonthValue() &&
            currentDate.getDayOfMonth() == birthday.getDayOfMonth()) {
            System.out.println("Happy Birthday!");
        } else {
            System.out.println("Today is not your birthday.");
        }

        // Creating another MonthDay object
        MonthDay anniversary = MonthDay.of(9, 15); // September 15th

        // Checking if the current date matches the specified MonthDay
        if (currentDate.getMonthValue() == anniversary.getMonthValue() &&
            currentDate.getDayOfMonth() == anniversary.getDayOfMonth()) {
            System.out.println("Happy Anniversary!");
        } else {
            System.out.println("Today is not your anniversary.");
        }
    }
}
