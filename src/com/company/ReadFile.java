package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        // http://textfiles.com/100/captmidn.txt

        File file = new File("/Users/admin/Desktop/JAVA/Practice/src/Files/hello.txt");
        Scanner scan = new Scanner(file);
        System.out.println("Working!");
        System.out.println(scan.nextLine());

        String fileContent = "THIS IS A NEW FILE MADE BY US";
        while (scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("/Users/admin/Desktop/JAVA/Practice/src/Files/hello2.txt");
        writer.write(fileContent);
        writer.close();

    }
}

