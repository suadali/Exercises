package Arrays;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        String[] alphabet = new String[]{"a", "b", "c", "d", "e"};
        String[] alphabet2 = alphabet;          //creating second array using the initialised original arrays

        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(alphabet2));
        alphabet2[0] = "z";
        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(alphabet2));

        //was only expecting alphabet2 array to change its first element to z but both changes.
        //this is because both arrays are pointing to the same space in the memroy (same reference) and hance has the
        //same exact info. changing one will therefore change the other. if we want to create a discrete copy
        //of our original array, we can use Arrays.copyOf() method.

    }
}


/*
        String[] alphabet = new String[5];
        alphabet[0] = "a";
        alphabet[1] = "b";
        alphabet[2] = "c";
        alphabet[3] = "d";
        alphabet[4] = "e";
 */