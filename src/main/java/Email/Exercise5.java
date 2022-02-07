package Email;

import java.util.Scanner;

public class Exercise5 {
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
         boolean ans = validateEmail(email);
         if (ans) {
             System.out.println(email);
         }
         else {
             String differentemail = differentEmails(email);
             System.out.println(differentemail);
             int index = email.indexOf(differentemail);
             System.out.printf("Substring .... is at index %d\n", index);
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

    static public String differentEmails(String email) {
         String[] emails = {"hotmail", "gmail", "outlook"};
         String emailaddress = "";
        boolean containsaddress = false;
        for (int i = 0; i < emails.length; i++) {
            emailaddress = emails[i];
            containsaddress = email.contains(emailaddress);

        if(containsaddress) {
            return emailaddress;
        }
        else {
            return "unknown error";
        }
        }




//            if (email.contains("hotmail")) {
//                return emailaddress;
//            } else if (email.contains("gmail")) {
//                return emailaddress;
//            } else if (email.contains("outlook")) {
//                return emailaddress;
//            }
            return emailaddress;
        }


//            switch(emailaddress) {
//                case "hotmail":
//                    containsaddress = email.contains("hotmail");
//                    return emailaddress;
//                    break;
//                case "gmail":
//                    emailaddress = "gmail";
//                    break;
//                case "outlook":
//                    emailaddress = "outlook";
//                default:
//                    System.out.println("Unknown input");
//            }

        }




