package com.softserve.edu.hw4;

import java.util.Scanner;


public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double min, max, med;

        if (a < b) {
            if (a < c) {
                min = a;
                max = b < c ? c : b;
                med = b < c ? b : c;
            } else {
                min = c;
                max = b;
                med = a;
            }
        } else {
            if (b < c) {
                min = b;
                med = a < c ? a : c;
                max = a < c ? c : a;
            } else {
                min = c;
                med = b;
                max = c;
            }
        }
        System.out.println(min);
        System.out.println(med);
        System.out.println(max);
    }


}