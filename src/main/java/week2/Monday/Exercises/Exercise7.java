package week2.Monday.Exercises;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        String[] inputStringArray = new String[] {"hello", "flour", "hello", "bye", "hello"};
        Exercise7 exercise7 = new Exercise7();
        exercise7.findTheLongestString(inputStringArray);
    }

    public void findTheLongestString(String[] inputStringArray) {
        //need to find the length of each word - for loop
        int longestWordLength = 0;
        String longestWord = "";
        String phrase = "";
//        String[] longWordArray = new String[5];         //change in a few
        for (int i = 0; i < inputStringArray.length; i++) {
            String word = inputStringArray[i];
            int wordLength = word.length();
            if(longestWordLength < inputStringArray[i].length()) {
                longestWordLength = inputStringArray[i].length();
                longestWord = word;

                phrase = "The longest word is: " + longestWord + ". It has " + longestWordLength + " letters";
            }
            else if (longestWordLength == inputStringArray[i].length()) {
                if(!longestWord.contains(inputStringArray[i])) {
                    //enhanced loop later to get values from array so can be printed as a normal string
                    //can do if == null, break to stop with array
                    longestWord += ", " + inputStringArray[i];
                    phrase = "The longest words are: " + longestWord + ". These words have " + longestWordLength + " letters";
                }
            }

        }
        System.out.println(phrase);

    }


    /*
            int longestWord = 0;
        String longestWordString = "";
        for (int i = 0; i < inputStringArray.length - 1 ; i++) {
            String word = inputStringArray[i];
            int wordLength = word.length();
            System.out.println(wordLength);
            if (wordLength > inputStringArray[i + 1].length()) {
                longestWordString = word;
                System.out.println(longestWordString);
            } else {
                longestWordString = inputStringArray[i + 1];
                System.out.println(longestWordString);
            }
        }
     */
    }




    /* OTHER SOLUTION
    public static void main(String[] args) {

        //First loop through array

        // Find lenght of each string
        // Compare it - if longer store
        String[] stringArray = {"hello", "ola", "bye", "ciao", "bingo", "okays", "bingo"};
        System.out.println(findLongestString(stringArray));

    }

    static String findLongestString(String[] strArray){

        String longestStr = strArray[0];
        int longestStrLength = strArray[0].length();

        for (int i = 1; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
            if (longestStrLength<strArray[i].length()){
                longestStr = strArray[i];
                longestStrLength = strArray[i].length();

            } else if (longestStrLength == strArray[i].length()){
                if(!longestStr.contains(strArray[i])) {
                    //if doesn't contain str then concatenate
                    longestStr = longestStr + ", " + strArray[i];
                }
            }

        }

        return longestStr;
    }
}
     */