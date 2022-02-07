package week2.Monday.Exercises;

import java.util.Scanner;

public class Exercise4Real {
        public static void main(String[] args) {
            System.out.println("Enter a number please: ");
            Scanner scn = new Scanner(System.in);
            int input = scn.nextInt();
            isPrime(input);
        }

        public static void isPrime(int input) {
            if(input <= 1) {
                System.out.println(input + " is NOT a prime");
            }
            else if (input == 2) {
                System.  out.println(input + " is the only even number which IS a prime");
            }
            else {
                String[] phrase = new String[1];

                for (int i = 2; i < input; i++) {
                    if (input%i == 0) {break;
                    }
                    else
                        phrase[0] = input + " is divisible by " + i + ". " + input + " is NOT prime";
                         {
                        phrase[0] = input + " IS a prime number";
                    }
                }
                System.out.println(phrase[0]);
            }
        }
}
