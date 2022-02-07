package Scanners;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingwithFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/Scanners/hello.txt");
        if (!file.exists()) {
            file.createNewFile();
        }


        Scanner scn = new Scanner(file);
        while(scn.hasNext()) {
            System.out.println(scn.nextLine());
        }
    }
}


/*
to write in file:
//        FileWriter fileWriter = new FileWriter(file);
//        PrintWriter printWriter = new PrintWriter(fileWriter);
//        printWriter.println("lool");
//        printWriter.flush();
//        printWriter.close();
 */