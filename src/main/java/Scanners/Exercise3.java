package Scanners;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        File newfile = new File("src/main/java/Scanners/Input.txt");

        if (!newfile.exists()) {
            newfile.createNewFile();
        }

        Scanner scn = new Scanner(newfile);
        while(scn.hasNext()) {
            System.out.println(scn.nextLine());
        }
    }
}
