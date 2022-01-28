package Loops;

//create some functionality which uses a for loop to print the even numbers from 0 to 20 (inclusive).
public class Exercise3 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 20; i = i+2){
            System.out.println(i);
        }
        for (i = 2; i <= 20; i = i+2){
            System.out.println(i);
        }
        for (i = 0; i <= 20; i = i+2){
            if(i>0) {
                System.out.println(i);
            }
        }
    }

}
