package com.softserve.edu.hw9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class LoginCheck {

        public static void main(String[] arg) {
            Scanner sc= new Scanner(System.in); //Start input stream
            System.out.print("Enter your password: ");
            String str= sc.nextLine();          //read password

            String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{12,999}$";
            boolean validPassword = isValidPassword(str,regex);
            System.out.println("password is valid:" +validPassword);
        }
        public static boolean isValidPassword(String password,String regex)
        {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }
    }