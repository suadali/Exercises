package EnumsDatesExceptions2;

public class Exercise8 {
    public static void main(String[] args) {
        try{
            for (int i=10; i >= 0; i--) {
                double result = 10/i;
                System.out.println(result);
            }


        }catch(ArithmeticException maths) {
            System.out.println("Cannot divide by 0");
        }
    }
}
