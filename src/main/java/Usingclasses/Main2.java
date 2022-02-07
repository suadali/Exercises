package Usingclasses;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
                PersonDao personDao = new PersonDao();
                Person person = new Person();
        System.out.println(Arrays.toString(personDao.getPeople()));
    }
}
