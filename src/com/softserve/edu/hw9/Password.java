package com.softserve.edu.hw9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_!@#&()–[{}]:;',?/*~$^+=<>]).{12,20}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPasswordCorrect;
        String result;
        do {
            System.out.println("Enter a password: ");
            String enteredPassword = scanner.nextLine();

            isPasswordCorrect = isCorrectPassword(enteredPassword);
            result = isPasswordCorrect ? "Password is correct" : "Password is incorrect";
            System.out.println(result);
        } while (!isPasswordCorrect);
    }
    static boolean isCorrectPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}