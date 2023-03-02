package com.softserve.edu.hw9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPasswordCorrect;
        do {

            System.out.println("Enter a password: ");
            String enteredPassword = scanner.nextLine();
            isPasswordCorrect = checkPassword(enteredPassword);
            if (isPasswordCorrect) {
                System.out.println("Password is correct");

            } else {
                System.out.println("Password is incorrect");
            }
        } while (!isPasswordCorrect);
    }

    static boolean checkPassword(String password) {
        Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{12,}$");
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
