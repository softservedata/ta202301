package com.softserve.edu.hw11;

import java.io.*;

public class File {
    public String readFromFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            String fileContent = "";
            while ((line = br.readLine()) != null) {
                fileContent += line;
            }
            return fileContent;
        }
    }

    public void writeToFile(String path, String fileContent) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(fileContent);
        }
    }
}
