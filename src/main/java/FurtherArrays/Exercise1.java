package FurtherArrays;

/*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */

public class Exercise1 {
    public static void main(String[] args) {
        String word = "Hi my name is Suad";
        String newword = "";
        for (int i = word.length() -1; i >= 0 ; i--) {
            newword += word.charAt(i);
        }
        System.out.println(newword);
    }
}
