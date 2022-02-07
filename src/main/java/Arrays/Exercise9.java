package Arrays;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[1]);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i]*2;   //this looks at the ith index of the array, obtains the original number then doubles it
        }
        System.out.println(Arrays.toString(numbers));
    }
}
