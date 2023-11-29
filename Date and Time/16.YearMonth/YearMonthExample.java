import java.time.YearMonth;
import java.time.LocalDate;

public class YearMonthExample {
    public static void main(String[] args) {
        // Creating a YearMonth object for the current year and month
        YearMonth currentYearMonth = YearMonth.now();
        System.out.println("Current Year-Month: " + currentYearMonth);

        // Creating a YearMonth object for a specific year and month
        YearMonth specificYearMonth = YearMonth.of(2023, 8); // August 2023
        System.out.println("Specific Year-Month: " + specificYearMonth);

        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Getting the year and month from the current date
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();

        // Checking if the current date is in the specified YearMonth
        if (currentYearMonth.getYear() == currentYear && currentYearMonth.getMonthValue() == currentMonth) {
            System.out.println("The current date is in the current Year-Month.");
        } else {
            System.out.println("The current date is not in the current Year-Month.");
        }

        // Adding a number of months to a YearMonth
        YearMonth futureYearMonth = currentYearMonth.plusMonths(3);
        System.out.println("Year-Month after adding 3 months: " + futureYearMonth);
    }
}
