package week2.EnumsDatesError;

import java.util.Arrays;

// invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
// hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Your chosen size is: " + ShirtSize.M);
        ShirtSize sizes[] = ShirtSize.values();
        System.out.println(Arrays.toString(sizes));  // this is printing out the array using the Array package
        for (ShirtSize size: sizes) {
            System.out.println(size.name().toLowerCase());  // loops through the sizes array and converts to string then makes lowercase
        }
    }
}
