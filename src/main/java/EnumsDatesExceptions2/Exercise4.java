package EnumsDatesExceptions2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class Exercise4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1998, 5, 6);
        System.out.println(date);
        System.out.println(date.plusDays(100));
    }
}
