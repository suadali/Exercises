package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise6b {
    public static void main(String[] args) {

        String[] alphabet = new String[]{"a", "b", "c", "d", "e"};
        String[] alphabet2 = Arrays.copyOf(alphabet,alphabet.length); //need to input the name of the array you want to copy and how long you want the new arrray  to be
        alphabet2[0] = "z";
        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(alphabet2));

        //in this case, the outputs will be different as you have created a copy of the original so wont be changing the original array
    }
}
