package method;

// Write a method which takes two numbers as arguments, checks
// if they are the same and returns the appropriate boolean value.

    public class Exercise3 {
        public static void main(String[] args) {

            boolean result = sameInt(4, 4);
            System.out.println(result);
        }

        public static boolean  sameInt(int int1, int int2) {
            boolean isSame = true;
            if (int1 == int2) {
                isSame = true;
            }
            else {
                isSame = false;
            }
            return isSame;
        }
    }



