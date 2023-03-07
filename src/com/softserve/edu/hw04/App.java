package com.softserve.edu.hw04;


import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value:");
        a = in.nextInt();
        System.out.println("Enter b value:");
        b = in.nextInt();
        System.out.println("Enter c value:");
        c = in.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}