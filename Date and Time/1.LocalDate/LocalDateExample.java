import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {
        // Create a LocalDate representing the current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // Create a LocalDate for a specific date
        LocalDate christmas = LocalDate.of(2023, 12, 25);
        System.out.println("Christmas date: " + christmas);

        // Accessing individual components of a LocalDate
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);

        // Manipulating dates
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow's date: " + tomorrow);

        LocalDate nextMonth = today.plusMonths(1);
        System.out.println("Date next month: " + nextMonth);

        // Comparing dates
        if (today.isBefore(christmas)) {
            System.out.println("Today is before Christmas.");
        } else if (today.isAfter(christmas)) {
            System.out.println("Today is after Christmas.");
        } else {
            System.out.println("Today is Christmas!");
        }
    }
}
