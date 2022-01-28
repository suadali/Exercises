package week2.Monday.Exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Boolean cont = true;

        while (cont) {
            printMenu();
            Scanner n = new Scanner(System.in);
            String input = n.nextLine();

            if (input.equals("Yes") || input.equals("yes")) {
                Yes();
            } else if(input.equals("No") || input.equals("no")) {
                System.out.println("No joke for you");
                cont = false;
            }
            else {
                System.out.println("Unknown");
            }
        }

    }



    private static void Yes() {
        int random = (int )(Math.random() * 4);
        switch(random) {
            case 1:
                System.out.println("I'm afraid for the calendar. Its days are numbered.");
                break;
            case 2:
                System.out.println("My wife said I should do lunges to stay in shape. That would be a big step forward.");
                break;
            case 3:
                System.out.println("Why do fathers take an extra pair of socks when they go golfing? In case they get a hole in one!");
                break;
            default:
                System.out.println("The biggest joke of em all: you");
        }

    }

    public static void printMenu() {
        System.out.println("Want to hear a joke?");
        System.out.println("Yes/No");
    }
}
