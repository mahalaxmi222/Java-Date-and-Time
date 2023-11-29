import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        // Creating two LocalDate objects
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 1);

        // Calculating the period between two dates
        Period period = Period.between(startDate, endDate);

        // Retrieving the period components (years, months, days)
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Period: " + years + " years, " + months + " months, " + days + " days");

        // Creating a period explicitly
        Period customPeriod = Period.of(1, 6, 15); // 1 year, 6 months, 15 days
        System.out.println("Custom Period: " + customPeriod);

        // Adding a period to a date
        LocalDate newDate = startDate.plus(customPeriod);
        System.out.println("New Date after adding custom period: " + newDate);
    }
}
