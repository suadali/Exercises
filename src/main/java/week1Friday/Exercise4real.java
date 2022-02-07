package week1Friday;

import java.util.Arrays;

public class Exercise4real {
    public static void main(String[] args) {
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";

        //split() method splits a string into multiple strings
        //it does this by looking for the thing inside the parameters and splits when the format is satisfied.
        //ie in our case, we want to split after ", "
        //here I have created an array which stores all the split strings:
        // output: [0.90, 1.00, 9.00, 8.78, 0.01]

        String[] inputArray = input.split(", ");
        double sum = 0;


        for (String number : inputArray) {
            System.out.println(number.getClass().getName());  //at the moment, all the numbers are strings. need to convert to double
            // need to convert string to double by using the Double class then using parseDouble()
            //this returns a new double of the value of the original string (number)
            double newnumber = Double.parseDouble(number);
            // newnumber is now all a double and not a string

            //to add the numbers together, need to store the number in the sum variable and keep on adding
            sum += newnumber;

        }

        System.out.println(sum);
    }



//        for(int i =0; i < inputArray.length; i++) {
//            String number = inputArray[i];
//            System.out.println(number);
//            double numberDbl = Double.parseDouble(number);
//            sum += numberDbl;
//        }

}
