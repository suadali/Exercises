package Loops;


//9. Create a loop that finds the greatest number in an array
// of numbers, prints the number (+ prints the index)
//Start with the array of numbers: [1, 6, 17, 9, 20, 5] Using a
// for loop to go through the array to find the greatest value Print the greatest number in the array
public class Exercise9 {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 17, 9, 20, 5};
        int maxNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(maxNum < numbers[i]) {
                maxNum = numbers[i];
            }
            System.out.println(maxNum);

        }
    }
}


//better solution:
//int maxNum = 0;
//for (int number : numArray) {
//    if (number > maxNum) {
//    maxNum = number;}
//}
//System.out.println(maxNum);