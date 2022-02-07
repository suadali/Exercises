package Usingclasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PersonDAODRAFT {
    private Person person;

    //Constructor for DAO, NOT METHOD!!
    public PersonDAODRAFT() {
//
//        File file = new File("src/main/java/Usingclasses/PersonDB.txt");
//        Scanner scn = new Scanner(file);
//        while(scn.hasNext()) {
//            System.out.println(scn.nextLine());
//            System.out.println("-----------");
//        }

        try {
            File file = new File("src/main/java/Usingclasses/PersonDB.txt");
            int numberOfPeople = getNumberOfLineInFile(file);
            Person[] personArr = new Person[numberOfPeople];


            Scanner scn = new Scanner(file);
            //reads first line: id,first_name,last_name,email,gender
            scn.nextLine();
            int arrayposition = 0;
            while(scn.hasNext()) {

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


            //this is for one person only
//            String onePersonInfo = scn.nextLine();
//            System.out.println(onePersonInfo);
//            String[] firstPersonInfoArray = onePersonInfo.split(",");
//            System.out.println(Arrays.toString(firstPersonInfoArray));
//
//
//            //atm, id is string and not an integer so needs to be conveted into an integer
//            int id = Integer.parseInt(firstPersonInfoArray[0]);
//            String fName = firstPersonInfoArray[1];
//            String lName = firstPersonInfoArray[2];
//            String email = firstPersonInfoArray[3];
//            String gender = firstPersonInfoArray[4];
//
//            Person person1 = new Person(id, fName, lName, email, gender);
//            Person person2 = new Person(2, fName, lName, email, gender);
//
//
//            //create a person array:
//
////            personArr[0] = person1;
//            personArr[1] = person2;

            System.out.println(Arrays.toString(personArr));
        }catch(IOException e) {
            System.out.println("File not found");
        }

    }

    //method to count the number of lines in file
    public static int getNumberOfLineInFile (File file){
        int numberOfLines = 0;
        try{
            Scanner scn = new Scanner(file);
            scn.nextLine();
            while(scn.hasNext()) {
                scn.nextLine();
                numberOfLines++;
            }
            return numberOfLines;
        }
        catch(IOException e) {
            System.out.println("File not found");
        }
        return 0;
    }
}
