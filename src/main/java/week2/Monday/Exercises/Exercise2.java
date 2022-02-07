package week2.Monday.Exercises;

public class Exercise2 {
    /*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
    public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";

        String ans = input.replaceAll("\\s","");
        System.out.println(ans);
        // output: brightnetwork


        String brightnetwork = "";
        for (int i = 0; i < ans.length(); i++) {
            switch(i) {
                case 0:
                    brightnetwork += "B";
                    break;
                case 6:
                    brightnetwork += " N";
                    break;
                default:
                    brightnetwork += ans.charAt(i);
            }
        }
        System.out.println(brightnetwork);
    }
}
