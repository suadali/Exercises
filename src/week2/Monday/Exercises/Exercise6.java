package week2.Monday.Exercises;

import java.util.Scanner;

public class Exercise6 {
    /*
       Create a package called email
       Then have a method called validateEmail that return true of false if input is valid email
       Finally invoke validateEmail in main
           i.e. "hello@gmail.com" -> true
           i.e. "hellogmail.com" -> false

           String test_str = "Hello";
     CharSequence seq = "He";
     boolean bool_1 = test_str.contains(seq);
     System.out.println("Was the substring found? " + bool_1);
     boolean bool_2 = test_str.contains("Lo");
     System.out.println("Was the substring found? " + bool_2);



   */
    public static void main(String[] args) {
        System.out.println("Enter your email: ");
        Scanner scn = new Scanner(System.in);
        String email = scn.nextLine();
        boolean emailIsCorrect = validateEmail(email);
        if (emailIsCorrect) {
            System.out.println(email);
        }
        else {
            int index = email.indexOf("gmail");
            System.out.printf("Substring 'gmail' is at index %d\n", index);
            String first = email.substring(0,index);
            String second = email.substring(index,email.length());
            System.out.println(first + "@" + second);
        }
    }

    static public boolean validateEmail(String email) {
        boolean greeting;
        String symbol = "@";
        boolean symbolCheck = email.contains(symbol);
        if(symbolCheck) {
            greeting = true;
        }
        else {
            greeting = false;
        }
        return greeting;
    }


}

