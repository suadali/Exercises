package week2.Monday.Exercises;

import java.util.Arrays;

public class classdemo {
    public static void main(String[] args) {

        String name = "Wendy, Linda, Will";
        String[] names = {"Wendy", "Linda", "Will"};
        System.out.println(names);  // this wont print anything
        System.out.println(Arrays.toString(names));   //this will print [Wendy, Linda, Will]

        double[] nums = new double[3];  // this creates a new array of decimal numbers with 3 elements. at the moment, content inside not specified

        Arrays.fill(nums, -1);  // the default value for the above is 0.0, 0.0, 0.0. this subtracts 1 from all numbers

        System.out.println(Arrays.toString(nums)); // this prints the array (as a string).
//
        System.out.println(names.length);  //prints out the number of elements inside names array
        System.out.println(nums.length);  //prints out the number of elements inside nums array

// ---------------------------------------------------------------------------------------------------------------------
        System.out.println("NEXT EXERCISE");

        String[] people = {"Wendy", "Linda", "Will", "Alex", "Nasir", "Hajr"};
        names[2] = "William"; // this changes the name of the 2nd indexed element to William. ie will to william
        System.out.println(Arrays.toString(people)); //arrays will not be printed unless Arrays.toString is used



        for (int i = people.length - 1; i >= 0; i--) {
            System.out.println("index " + i + " " + people[i].toUpperCase());
        }

    }
}