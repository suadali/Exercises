package EnumsDatesExceptions2;

import java.io.IOException;
import java.time.LocalDate;

public class Exercise5 {
    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//        int year = now.getYear();
//        System.out.println(year);
//        LocalDate currentYear = LocalDate.ofEpochDay(now.getYear());
//        System.out.println(currentYear);

            LocalDate dob2 = LocalDate.of(1998, 5, 6);
            int age = calculateAge(dob2);
            System.out.println("you are " + age + " years old.");

        if(age>20) {
            System.out.println("Welcome in!");
        }
        else{
            throw new IllegalStateException("you are not allowed in");
        }
    }


    public static int calculateAge(LocalDate dob) {

        //finds current date and the year
        LocalDate now = LocalDate.now();
        int currentyear = now.getYear();

        //using whatever date is inputted, finds the year
        int dobYear = dob.getYear();

        int age = currentyear - dobYear;

        return age;
    }
}
