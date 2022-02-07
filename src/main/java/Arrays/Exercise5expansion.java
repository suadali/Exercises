package Arrays;

import java.util.Arrays;
import java.util.Locale;

public class Exercise5expansion {
    public static void main(String[] args) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"};
        System.out.println(Arrays.toString(alphabet));
        int counter = 0;
        String vowels = "";
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i].equals("a") || alphabet[i].equals("e") || alphabet[i].equals("i")  || alphabet[i].equals("o") || alphabet[i].equals("u") ) {
                counter++;
                vowels += alphabet[i].toUpperCase() + ", ";
            }
        }
        String finalstring = "In your array, you have "+ counter + " vowels. They are: " + vowels;
        System.out.println(finalstring.substring(0, finalstring.length() - 2)+ ".");
    }
}
