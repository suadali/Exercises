package week2.Monday.Exercises;
import java.util.Scanner;

// Alex's solution. Extra complicated.
public class Exercise4Rough {
    /*
     Write a program that takes an input number from the console and prints if number is prime
     Create a method to check if number is prime then use against the input
    */
    public static void main(String[] args) {
        // Defines the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any positive integer:");
        int number = scanner.nextInt();
        isprime(number);
    }

    static void isprime(int number){
        // Switch statement to deal with the special cases of 1 and 2
        switch (number) {
            case 1:
                System.out.println(number + " is a special case.");
                System.out.println(number + " is a not a prime number");
                break;
            case 2:
                System.out.println(number + " is the only even number which IS a prime number");
                break;
            default:
                // Loop through all integers up to the number to check if it's prime or not
                for (int i = 2; i < Math.sqrt(number); i++) {
                    // If current i is a factor this is not a prime
                    if (number % i == 0) {
                        System.out.println(number + " is divisible by " + i);
                        System.out.println(number + " is NOT a prime number");
                        break;
                    }
                    // If on last step and no factors have been found we have a prime
                    else if (i == number - 1) {
                        System.out.println(number + " is a prime number");
                    }
                }
        }
    }
}









/* Gives correct answers but it prints more than one thing.
package week2.Monday.Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Enter a number please: ");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        boolean primeNumber;
        isPrime(input);
    }

    public static void isPrime(int input) {
        if(input <= 1) {
            boolean primeNumber = false;
            System.out.println(input + " is NOT a prime");
        }
        else {
            for (int i = 2; i < input; i++) {
                if (input%i == 0) {
                    boolean primeNumber = false;
                    System.out.println(input + " is divisible by " + i);
                    System.out.println(input + " is NOT a prime");
                    break;
                }
                else {
                    boolean primeNumber = true;
                    System.out.println(i + "ALERT PRIME");
                }
            }
        }
    }
}

 */




/* BOTH THE CODES BELOW SAY 25 IS A PRIME
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Enter a number please: ");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        boolean outcome = isPrime(input);
        if (outcome) {
            System.out.println(input + ": ALERT PRIME");
        }
        else {

            System.out.println(input + " is NOT a prime");
        }
    }

    public static boolean isPrime(int input) {
        boolean primeNumber = false;
        if(input <= 1) {
            primeNumber = false;
        }
        else {
            for (int i = 2; i < Math.sqrt(input); i++) {
                if (input%i == 0) {
                    primeNumber = false;
                    System.out.println(input + " is divisible by " + i);
                }
                else{
                    while (i < Math.sqrt(input)) {

                    }
                    primeNumber = true;
                    System.out.println(i);
                }
                }
            }
        return primeNumber;
        }
    }
*/