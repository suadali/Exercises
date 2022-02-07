package Scanners;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scn.nextLine();
        String capitalise = name.toUpperCase();
        System.out.println(capitalise);

        //uppercase first letter
        String firstletter = name.substring(0,1);
        String uppercaseFirstLetter = firstletter.toUpperCase();
        String restofword = name.substring(1);
        String uppercaseName = uppercaseFirstLetter + restofword;
        System.out.println(uppercaseName);
    }
}
