package FurtherArrays;

/*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */

public class Exercise2 {
    public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";
        input = input.trim();               // if I wanted to remove the whitespace in between, I can use         input = input.replaceAll("\\s","");
        String returnedinput = "";
        System.out.println(input);
        for (int i = 0; i < input.length(); i++) {
            String returnedchar = String.valueOf(input.charAt(i));

            switch (returnedchar) {
                case "b":
                    returnedinput += "B";
                    break;
                case " ":
                    returnedinput += "";
                    break;
                case "n":
                    returnedinput += " N";
                    break;
                default:
                    returnedinput += input.charAt(i);
            }
        }
        System.out.println(returnedinput);
    }
}

//previous ans:
/*
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
 */
