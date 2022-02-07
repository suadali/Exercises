package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] myArray = new int[3];         //this sets an array which has a capacity of 3. currently it is filled only with null
        Arrays.fill(myArray, 4);     //this fills the whole arrays with 4
        myArray[1] = 17;                //this makes the second element 17
        System.out.println(Arrays.toString(myArray));
    }

}
