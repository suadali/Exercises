package Loops;

//Start with the array: ["i", "sure", "do", "love", "bees"].
// Create a for loop which makes each word uppercase in the array.
// Print the contents of the array in the terminal.

import java.util.Arrays;
import java.util.Locale;

public class Exercise8 {
    public static void main(String[] args) {
        String[] words = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < words.length; i++) {


            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        System.out.println(Arrays.toString(words));
    }
}
