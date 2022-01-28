package week2.EnumsDatesError;

// 1 - Print todays Date and Time using LocalDate
// 2 - Represent your date of birth using LocalDate
// 3 - Add 100 days to your dob and print it

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Exercise4 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDate dob = LocalDate.of(1998, Month.JUNE, 05);
        System.out.println(dob.getDayOfWeek());
        System.out.println(dob.getDayOfYear());
        System.out.println(dob.getDayOfMonth());
        System.out.println(dob.getMonth());
        System.out.println(dob.getYear());
        System.out.println(dob.plusDays(100));
    }
}
