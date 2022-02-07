package method;

// Write a method which takes an array of strings as an
// argument and returns the number of items in the array.

public class Exercise6 {
    public static void main(String[] args) {
        String [] list= {"Scarlett witch", "Hulk", "Thanos", "Spider-man vs1", "Groot", "Korgs"};
        System.out.println(listOfMarvelChar(list));

    }

    //write a method -
    public static int listOfMarvelChar(String[] avengers) {

        return avengers.length;

    }

}