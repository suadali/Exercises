package week2.EnumsDatesError;

// write a method that calculate age on any given date

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Input the year you were born: ");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        int finalage = CalcAge(year);
        System.out.println("You are " + finalage + " years old.");
    }

    public static int CalcAge(int year) {
        LocalDate now = LocalDate.now();
        int yearnow = now.getYear();
        int age = yearnow - year;
                return age;
    }

//    public static void random() {
//        int year = 2000;
//        int month = 2;
//        int day = 5;
//        LocalDate dob = LocalDate.of(year, month, day);
//    }
}
