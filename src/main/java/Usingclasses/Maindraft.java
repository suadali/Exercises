package Usingclasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Maindraft {
    public static void main(String[] args) throws FileNotFoundException {
//        PersonDao personDao = new PersonDao();

        File file = new File("src/main/java/Usingclasses/PersonDB.txt");
        Scanner scn = new Scanner(file);
        //reads first line: id,first_name,last_name,email,gender
        scn.nextLine();
        String firstperson = scn.nextLine();
        System.out.println(firstperson);
        String[] firstPersonInfoArray = firstperson.split(",");
        System.out.println(Arrays.toString(firstPersonInfoArray));


        //atm, id is string and not an integer so needs to be conveted into an integer
        int id = Integer.parseInt(firstPersonInfoArray[0]);
        String fName = firstPersonInfoArray[1];
        String lName = firstPersonInfoArray[2];
        String email = firstPersonInfoArray[3];
        String gender = firstPersonInfoArray[4];

        Person person1 = new Person(id, fName, lName, email, gender);
        System.out.println(person1);
    }


}
