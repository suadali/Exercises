package Loops;
//create some functionality which uses a for loop which adds all numbers
// from 0 to 10 (inclusive) to an array. Print this array in the console.
public class Exercise4 {
    public static void main(String[] args) {
//            for (int i = 0; i <= 10; i++) {
//                int sum = 0;                    //if this is in the loop, each time you iterate, you set the sum back to 0
//                sum += i;
//                System.out.println(sum);
//            }

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
        System.out.println(sum);
    }
}
