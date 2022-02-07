package week2.EnumsDatesError;

public class Exercise6 {
    public static void main(String[] args) {
        // try catch
        // write a program that converts program arguments to and integer
        // if value cannot be converted to int store them somewhere
        // calculate sum for numbers that can be converted to an integer
        // finally print the numbers that cannot be converted to an int
        // example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
        // output: Sum: 5 and a, b, foo are not numbers.

//        try {
//            int result = Integer.parseInt("10x");
//            System.out.println(result);
//        } catch (NumberFormatException numberFormatException) {
//            System.out.println("oops input not a number");
//        }catch (Exception e) {
//            System.out.println("catch all");
//            System.out.println(e);
//        }




// args[] = {2, 4, 5}

//        int sum = 0;
////        String[] phrase = new String[args]
//        String phrase = "";
//        for (int i = 0; i < args.length; i++) {
//            int number = Integer.parseInt(args[i]);
//            try {
//                sum = sum + number;
//            }
//            catch (Exception e) {
////                phrase += arg;
//                System.out.println("whoopsie");
//            }
////            catch (NumberFormatException NumberFormatException) {
////                phrase += args[i];
////                System.out.println("whoopsie");
////            }
//
//        }
//        System.out.println("Final sum is: " + sum);


        int sum = 0;
        String phrase = "";
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                sum = sum + number;
            }
            catch (NumberFormatException numberFormatException) {
                System.out.println("whoopsie");
                phrase += arg + " ";
            }
        }
        System.out.println("Final sum is: " + sum);
        System.out.println(phrase + "are not numbers");
    }
}
