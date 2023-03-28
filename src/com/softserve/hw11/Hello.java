package com.softserve.hw11;
/* Homework 11 (from 10.03.2023)
1) Замінити у тестовому файлі всі входження слова Welcome на Hello
   Для коду використати пакет com.softserve.homework11
   Запушати код на github у свою вітку.*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hello {
   private static final String FILE_PATH = "C:\\Users\\MarynaNosach\\Projects\\ta202301";
    public static void main(String[] args) throws IOException {
        String fileName = "Welcome.txt";
        String search = "Welcome";
        String replace = "Hello";
        
        Path path = Path.of(fileName);
        Files.write(path, new String(Files.readAllBytes(path)).replace(search, replace).getBytes());
            }
        }
