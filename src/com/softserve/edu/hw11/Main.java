package com.softserve.edu.hw11;

import java.io.IOException;

public class Main {
    private static final String FILE_PATH = "C:\\Users\\vbrah\\Documents\\SoftServe\\Java\\hw11\\hw11.txt";

    public static void main(String[] args) {
        File file = new File();
        try {
            String fileText = file.readFromFile(FILE_PATH);
            System.out.println("The file is read: " + FILE_PATH);
            System.out.println(fileText);
            if (fileText.contains("Hello")) {
                String updatedText = replaceWord(fileText);
                System.out.println("Writing to the file: " + FILE_PATH);
                file.writeToFile(FILE_PATH, updatedText);
                System.out.println("The " + FILE_PATH + " was written successfully!");
            } else {
                System.out.println("There are no \"Hello\" to replace");
            }
        } catch (IOException e) {
            System.out.println("Error when reading a file: " + FILE_PATH);
        }
    }

    private static String replaceWord(String str) {
        return str.replace("Hello", "Welcome");
    }
}
