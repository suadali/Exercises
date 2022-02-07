package week2.Monday.Exercises;

public class Exercise1 {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {
        String reversed = reverseProgram("Suad"); // this method can be stored as a variable since it returns a value
        System.out.println(reversed);
        System.out.println("----------");
        reverseProgram2("hello"); // this cannot be stored as a variable since it only prints to the console, it doesnt return anything
    }

    // this returns and not prints
    public static String reverseProgram(String input) {
        String characters = "";
        for (int i = input.length() - 1; i >= 0; i--) {
                    characters += input.charAt(i);

        }
        return characters;
    }


    //this prints, not returns
    public static void reverseProgram2(String input) {
        String characters = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            characters += input.charAt(i);

        }
        System.out.println(characters);
    }

}
