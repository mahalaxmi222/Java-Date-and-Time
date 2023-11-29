import java.time.Month;
import java.time.LocalDate;

public class MonthExample {
    public static void main(String[] args) {
        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Getting the current month from the current date
        Month currentMonth = currentDate.getMonth();
        System.out.println("Current Month: " + currentMonth);

        // Getting the current month as an integer (1-12)
        int monthValue = currentDate.getMonthValue();
        System.out.println("Current Month (as integer): " + monthValue);

        // Checking if the current month is before or after a specific month
        Month targetMonth = Month.JULY;
        if (currentMonth.compareTo(targetMonth) < 0) {
            System.out.println("The current month is before July.");
        } else if (currentMonth.compareTo(targetMonth) > 0) {
            System.out.println("The current month is after July.");
        } else {
            System.out.println("The current month is July!");
        }

        // Getting the name of the month and its length
        String monthName = currentMonth.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault());
        int monthLength = currentMonth.length(currentDate.isLeapYear());
        System.out.println("Month Name: " + monthName);
        System.out.println("Month Length: " + monthLength + " days");
    }
}
