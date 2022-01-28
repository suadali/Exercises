package method;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Input a word");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        capitalise(input);
    }

    public static void capitalise(String input) {
        String output = input.substring(0, 1).toUpperCase() + input.substring(1, input.length());
//        String output = input.charAt(input(0)).toUpperCase();
        System.out.println(output);
//        System.out.println(input(0));
    }
}
