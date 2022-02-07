package week1Friday;

public class Exercise3 {
    public static void main(String[] args) {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */
        String[] content = {"you", "are", "how", "hello"};

        //forward for loop
//        for (int i = 0; i < content.length; i++) {
//            System.out.println(content[i]);
//        }

        String result = "";
        for (int i = content.length - 1; i >= 0; i--) {
            result += content[i] + " ";
        }
        System.out.println(result.substring(0, result.length() - 1) + "?");
    }
}
