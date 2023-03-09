package com.softserve.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number:");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter second number:");
        int b = Integer.parseInt(br.readLine());
        System.out.print("Enter third number:");
        int c = Integer.parseInt(br.readLine());
br.close();

int p;
        if (a > b) {
           p = a;
            a = b;
            b = p;
        }

        if (b > c) {
            p = b;
            b = c;
            c = p;
        } else b = b;

        if (a > b) {
            p = a;
            a = b;
            b = p;
        } else c = c;

        System.out.println(+a);
        System.out.println(+b);
        System.out.println(+c);

    }
}
