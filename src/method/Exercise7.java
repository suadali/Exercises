package method;

/*Write a method which takes a sentence as an argument, counts the number of words in the array and prints "The sentence contains X words".

HINT: Remember what you've done already, you might be able to reuse one of your methods here...

1.create a string in the  main
2.create a method and argument
3.
 */

public class Exercise7 {
    public static void main(String[] args) {

        String [] sentence={"I", "like", "turtles"};
        counter(sentence);
    }

    public static void counter(String[] sentences) {

        System.out.println("The sentence contains " + sentences.length + " words");
    }

}
