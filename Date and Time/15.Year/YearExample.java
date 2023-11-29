import java.time.Year;
import java.time.LocalDate;

public class YearExample {
    public static void main(String[] args) {
        // Creating a Year object for the current year
        Year currentYear = Year.now();
        System.out.println("Current Year: " + currentYear);

        // Creating a Year object for a specific year
        Year specificYear = Year.of(2023);
        System.out.println("Specific Year: " + specificYear);

        // Checking if a year is a leap year
        if (currentYear.isLeap()) {
            System.out.println(currentYear + " is a leap year.");
        } else {
            System.out.println(currentYear + " is not a leap year.");
        }

        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Getting the year from the current date
        int yearFromCurrentDate = currentDate.getYear();
        System.out.println("Year from Current Date: " + yearFromCurrentDate);

        // Checking if a specific year is after the current year
        if (specificYear.isAfter(currentYear)) {
            System.out.println(specificYear + " is after " + currentYear);
        } else {
            System.out.println(specificYear + " is not after " + currentYear);
        }
    }
}
