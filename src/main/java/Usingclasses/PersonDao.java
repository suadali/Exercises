package Usingclasses;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PersonDao {
    private Person person;
    private Person[] people;

    //Constructor for DAO, NOT METHOD!!
    public PersonDao() {

        try {
            File file = new File("src/main/java/Usingclasses/PersonDB.txt");
            int numberOfPeople = getNumberOfLineInFile(file);
            Person[] personArr = new Person[numberOfPeople];


            Scanner scn = new Scanner(file);
            //reads first line: id,first_name,last_name,email,gender
            scn.nextLine();
            int arrayposition = 0;
            while (scn.hasNext()) {

                String onePersonInfo = scn.nextLine();
                String[] firstPersonInfoArray = onePersonInfo.split(",");


                //atm, id is string and not an integer so needs to be conveted into an integer
                int id = Integer.parseInt(firstPersonInfoArray[0]);
                String fName = firstPersonInfoArray[1];
                String lName = firstPersonInfoArray[2];
                String email = firstPersonInfoArray[3];
                String gender = firstPersonInfoArray[4];

                Person person = new Person(id, fName, lName, email, gender);
                personArr[arrayposition] = person;
                System.out.println(personArr[arrayposition]);
                arrayposition++;
            }
//            System.out.println(Arrays.toString(personArr));
            people = personArr;

        } catch (IOException e) {
            System.out.println("File not found");
        }

    }

    //method to count the number of lines in file
    public static int getNumberOfLineInFile(File file) {
        int numberOfLines = 0;
        try {
            Scanner scn = new Scanner(file);
            scn.nextLine();
            while (scn.hasNext()) {
                scn.nextLine();
                numberOfLines++;
            }
            return numberOfLines;
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return 0;
    }

    //getter to access people array
    public Person[] getPeople() {
        return people;
    }
}
