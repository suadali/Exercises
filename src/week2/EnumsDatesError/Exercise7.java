package week2.EnumsDatesError;

import java.time.LocalDate;
import java.time.Month;

public class Exercise7 {
    public static void main(String[] args) {
        // create a method that sums days of the month for a given array of LocalDate

        LocalDate month = LocalDate.of(2000,Month.JUNE, 4);
        Month input = month.getMonth();



        int finalanswer = addDays(LocalDate.from(Month.JUNE));
        System.out.println(finalanswer);
    }

    public static int addDays(LocalDate input) {
        int sum = 0;
        int month = input.lengthOfMonth();
        for (int i = 1; i < month; i++) { //change this
            sum += i;
        }
        return sum; //change this
    }
}
