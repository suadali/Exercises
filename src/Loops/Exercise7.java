package Loops;


//Start with the array: ["i", "sure", "do", "love", "bees"].
// Create a for loop which makes each word uppercase in the array.
// Print the contents of the array in the terminal.

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {


        //this creates a second array and adds the new capital words inside
//        String[] words = {"i", "sure", "do", "love", "bees"};
//        String[] capitalisedwords = new String[5];
//        for (int i = 0; i < words.length; i++) {
//            capitalisedwords[i] = words[i].toUpperCase();
//        }
//        System.out.println(Arrays.toString(capitalisedwords));

        String[] words = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toUpperCase();
        }
        System.out.println(Arrays.toString(words));

    }
}
