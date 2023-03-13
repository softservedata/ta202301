package com.softserve.edu.hw11;

import java.io.IOException;

public class App {

    private static final String FILE_PATH = "C:\\\\Users\\dnos\\HW11.txt";

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        try {
            String fileContent = fileProcessor.readFromFile(FILE_PATH);
            System.out.println("The file is read: " + FILE_PATH);
            System.out.println(fileContent);
            if (fileContent.contains("Hello")) {
                String updatedData = replaceWords(fileContent, "Hello", "Welcome");
                System.out.println("Writing to the file: " + FILE_PATH);
                fileProcessor.writeToFile(FILE_PATH, updatedData);
                System.out.println("The " + FILE_PATH + " was written successfully");
            } else {
                System.out.println("There are no words to replace");
            }
        } catch (IOException e) {
            System.out.println("Error when reading a file:" + FILE_PATH);
        }
    }

    private static String replaceWords(String str, String from, String to) {
        return str.replace(from, to);
    }
}
