package Scanners;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        boolean repeat = true;
        while(repeat) {
            try{
                System.out.println("What is your age?");
                Scanner scn = new Scanner(System.in);
                int age = scn.nextInt();
                System.out.print("You are " + age + " years old");
                repeat = false;
            }catch(InputMismatchException inputMismatchException) {
                System.out.println("you can only enter an integer");
            }
        }



        //throwing exceptions
        /*
        System.out.println("What is your age?");
                Scanner scn = new Scanner(System.in);
                int age = scn.nextInt();
                if(age < 18) {
                    throw new IllegalStateException("sorry you are too young");
                }
                System.out.print("You are " + age + " years old");
         */





    }
}
