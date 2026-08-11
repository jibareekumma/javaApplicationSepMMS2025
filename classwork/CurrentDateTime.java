import java.time.LocalDateTime;

public class LocalDateTimeMethods {
    public static void main(String[] args) {

        // now()
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current Date and Time: " + current);

        // of(year, month, day, hour, minute)
        LocalDateTime meeting = LocalDateTime.of(2026, 7, 1, 10, 30);
        System.out.println("Meeting: " + meeting);

        // parse("YYYY-MM-DDTHH:mm:ss")
        // Notice the 'T' between the date and time.
        LocalDateTime parsedDate = LocalDateTime.parse("2026-07-01T15:45:20");
        System.out.println("Parsed Date: " + parsedDate);

        // getYear(), getMonth(), getDayOfMonth()
        System.out.println("Year: " + parsedDate.getYear());
        System.out.println("Month: " + parsedDate.getMonth());
        System.out.println("Day: " + parsedDate.getDayOfMonth());

        // getHour()
        System.out.println("Hour: " + parsedDate.getHour());

        // plusDays(), plusHours()
        LocalDateTime futureDate = parsedDate.plusDays(5);
        System.out.println("After 5 Days: " + futureDate);

        LocalDateTime futureHour = parsedDate.plusHours(8);
        System.out.println("After 8 Hours: " + futureHour);

        // minusMinutes()
        LocalDateTime earlier = parsedDate.minusMinutes(30);
        System.out.println("30 Minutes Earlier: " + earlier);

        // isBefore(), isAfter()
        System.out.println("Is parsedDate before futureDate? " +
                parsedDate.isBefore(futureDate));

        System.out.println("Is futureDate after parsedDate? " +
                futureDate.isAfter(parsedDate));

        // equals()
        LocalDateTime copy = LocalDateTime.parse("2026-07-01T15:45:20");

        System.out.println("Is parsedDate equal to copy? " +
                parsedDate.equals(copy));
    }
}