package com.softserve.hw9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
Homework 9 (from 01.03.2023)
1) Нехай згідно вимог пароль користувача повинен бути не коротшим за 12 символів та містити великі та малі букви латинського алфавіту, цифри і спецсимволи.
   Використовуючи регулярні вирази, виконайте перевірку пароля (прочитати з клавіатури) на валідність.
   Для коду використати пакет com.softserve.edu.hw09
   Запушати код на github у свою вітку.
*/
public class Password {
    static String Pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{12,}$";
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter new password:");
        String password  = br.readLine();

        Pattern p = java.util.regex.Pattern.compile((Pattern));
        Matcher m = p.matcher(password);

        if (m.matches()) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }
    }

}
