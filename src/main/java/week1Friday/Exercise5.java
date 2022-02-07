package week1Friday;

public class Exercise5 {
    /*
       Write a program that takes arguments from the program args and loops through args and prints each item in args
       Compile using: javac and run using: java
       i.e. javac week1.Friday.Exercise5.java | java week1.Friday.Exercise5 foo bar baz
     */
    public static void main(String[] args) {
        // loop through args here
        for (String arg: args
             ) {
            System.out.println(arg);
        }
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
    }
}

//command line:
/*
➜  src javac week1/Friday/Exercise5.java
➜  src java week1/Friday/Exercise5 Hi lol

 */


// ouptput should be: hi
                    //lol