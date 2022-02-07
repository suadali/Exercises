package week2.Monday.Exercises;

public class Exercise3 {
        /*
      Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
      You might compile and run the program via command line or by editing configuration and pass program arguments
    */
        public static void main(String[] args) {
            for(int i=0;i<args.length;i++) {
                String number = args[i];
                System.out.println(number);
                int num = Integer.parseInt(number);
                if(num % 2 == 0) {
                    System.out.println("Even");
                }
                else {
                    System.out.println("Odd");
                }
        }


        }

}
