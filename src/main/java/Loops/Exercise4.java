package Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;


public class Exercise4 {
    public static void main(String[] args) {


        //summing numberd together
            for (int i = 0; i <= 10; i++) {
                int sum = 0;                    //if this is in the loop, each time you iterate, you set the sum back to 0
                sum += i;
                System.out.println(sum);
            }

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(sum);   //if print is inside loop, it will printing
        }



        System.out.println("-----------------------");

        sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);  //final answer





        System.out.println("-----------------------");

        //create some functionality which uses a for loop which adds all numbers
        // from 0 to 10 (inclusive) to an array. Print this array in the console.

        int[] numberArray = new int[11];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }
        System.out.println(Arrays.toString(numberArray));




        //Using your answer to the previous question,
        //use a second for loop which prints each item in your
        //array to the terminal individually.

        System.out.println("-----------------------");

        for (int n : numberArray) {
            System.out.println(n);
        }

        System.out.println("-------------------------");

        //Using your answer from the question two above, use a for
        // loop to add each number to a sum value. Print the sum value.
        //    // create a sum variable
        //    // using your answer from Question 4, create a for loop
        //    that goes through the values
        //    // add each item to the sum value
        //    // print the total sum
        //

        int finalsum = 0;
        for (int nn : numberArray) {
            finalsum += nn;
        }
        System.out.println(finalsum);
    }

}
